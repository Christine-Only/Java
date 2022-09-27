package com.zhenliang.project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        System.out.println("========欢迎您进入Christine银行ATM系统========");
        Scanner sc = new Scanner(System.in);
        firstStepOperate(sc, accounts);
    }

    public static void firstStepOperate(Scanner sc, ArrayList<Account> accounts) {
        System.out.println("1. 登录账户");
        System.out.println("2. 注册开户");
        boolean flag = true;

        while (true) {
            System.out.println("请输入命令(1or2)选择对应的操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    login(accounts, sc);
                    break;
                case 2:
                    register(sc, accounts);
                    break;
                default:
                    System.out.println("输入命令有误！请重新输入。");
                    flag = false;
            }

            if(flag) {
                break;
            }

            System.out.println();

        }
    }

    public static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("请输入您的账户名称：");
        String name = sc.next();
        System.out.println("请输入您的账户密码：");
        String password = sc.next();
        if (accounts.size() == 0) {
            System.out.println("当前系统无任何账户，请先注册再登录！");
            firstStepOperate(sc, accounts);
        } else {
            for (int i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);
                if (account != null) {
                    if (account.getName().equals(name)) {
                        if (account.getPassword().equals(password)) {
                            System.out.println("欢迎您：" + account.getName() + "先生/女士进入系统，您可开始办理你的业务了！");
                            operate(account, sc, accounts);
                        } else {
                            System.out.println("密码错误，请重新输入");
                            firstStepOperate(sc, accounts);
                        }
                    }
                }
            }
        }
    }

    public static void register(Scanner sc, ArrayList<Account> accounts) {
        System.out.println("==========欢迎您进入到开户操作==========");
        Account account = new Account();
        System.out.println("请输入您的账户名称：");
        String name = sc.next();
        account.setName(name);
        while (true) {
            System.out.println("请输入您的密码：");
            String password = sc.next();
            System.out.println("请再次输入您的密码：");
            String confirmPassword = sc.next();
            if (!password.equals(confirmPassword)) {
                System.out.println("两次输入的密码不一致！");
            } else {
                account.setPassword(password);
                break;
            }
        }
        System.out.println("请您设置取现额度：");
        double limitMoney = sc.nextDouble();
        account.setWithdrawalLimit(limitMoney);
        String cardId = getRandomCardId(accounts);
        account.setIdNum(cardId);

        // 将账户对象添加到账户集合中
        accounts.add(account);
        System.out.println("恭喜您，" + name + "先生/女士，您开户完成， 您的卡号是：" + cardId );
        firstStepOperate(sc, accounts);
    }

    /**
     * 为账户生成八位且不重复的号码
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            // 根据卡号查询账户对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                return cardId;
            }
        }
    }

    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account1 = accounts.get(i);
            if(cardId.equals(account1.getIdNum())) {
                return account1;
            }
        }
        return null;
    }

    public static void getAccountInfoByIdNum(Account account) {
        System.out.println("您的账户信息如下：");
        System.out.println("卡号：" + account.getIdNum());
        System.out.println("姓名：" + account.getName());
        System.out.println("余额：" + account.getBalance());
        System.out.println("取现限额：" + account.getWithdrawalLimit());
    }

    public static void setAccountMoney(Scanner sc, Account account, ArrayList<Account> accounts) {
        System.out.println("==========欢迎进入账户存款操作==========");
        System.out.println("请输入您要存款的金额：");
        double money = sc.nextDouble();
        account.setBalance(money);
        getAccountInfoByIdNum(account);
        operate(account, sc, accounts );
    }

    private static void updateAccountBalance(ArrayList<Account> accounts, String cardId, double balance) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (cardId.equals(account.getIdNum())) {
                account.setBalance(balance);
            }
        }
    }

    public static double transferAccountMoney(Scanner sc, ArrayList<Account> accounts, double money) {
        while (true) {
            System.out.println("请您输入对方的卡号：");
            String cardId = sc.next();
            if (accounts.size() == 0) {
                System.out.println("您输入的转账卡号不存在！");
                firstStepOperate(sc, accounts);
            } else {
                for (int i = 0; i < accounts.size(); i++) {
                    Account account = accounts.get(i);
                    if (account.getIdNum().equals(cardId)) {
                        String name = account.getName();
                        String newName = name.replace(name.charAt(0), '*');
                        System.out.println("请您确认【" + newName + "】的姓氏来确认！");
                        System.out.println("请您输入对方的姓氏：");
                        String surname = sc.next();
                        if (name.startsWith(surname)) {
                            while (true) {
                                System.out.println("请您输入转账的金额（您最多可以转账：）" + money + "元");
                                double inputMoney = sc.nextDouble();
                                if (inputMoney <= money) {
                                    double restMoney = money - inputMoney;
                                    System.out.println("您已经完成转账！您当前还剩：" + (money - inputMoney));
                                    updateAccountBalance(accounts, cardId, inputMoney);
                                    return restMoney;
                                } else {
                                    System.out.println("您的余额不足！");
                                }
                            }
                        } else {
                            System.out.println("您输入对方信息有误！");
                        }
                    }
                }
            }
        }
    }

    public static void withdrawMoney(Scanner sc, Account account, ArrayList<Account> accounts) {
        System.out.println("==========欢迎进入账户取款操作==========");
        System.out.println("请输入您要取款的金额：");
        double inputMoney = sc.nextDouble();
        if (inputMoney > account.getBalance()) {
            System.out.println("余额不足！");
        } else {
            if (inputMoney <= account.getWithdrawalLimit()) {
                account.setBalance(account.getBalance() - inputMoney);
                getAccountInfoByIdNum(account);
                operate(account, sc, accounts );
            } else {
                System.out.println("取款金额超过上限！");
            }
        }
    }

    public static void updatePassword(Scanner sc, Account account, ArrayList<Account> accounts) {
        System.out.println("==========欢迎进入账户修改密码操作==========");
        System.out.println("请输入您的密码：");
        String password = sc.next();
        System.out.println("请再次输入您的密码：");
        String confirmPassword = sc.next();
        if (!password.equals(confirmPassword)) {
            System.out.println("两次输入的密码不一致！");
        } else {
            System.out.println("密码修改成功！");
            operate(account, sc, accounts );
        }
    }

    public static void logout(Scanner sc, Account account, ArrayList<Account> accounts) {
        accounts.remove(account);
        System.out.println("您的账户已经完成销毁，您将不可以进行登录了！");
        firstStepOperate(sc, accounts);

    }

    public static void operate(Account account, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("==========欢迎您进入到操作页面==========");
        System.out.println("1. 查询");
        System.out.println("2. 存款");
        System.out.println("3. 取款");
        System.out.println("4. 转账");
        System.out.println("5. 修改密码");
        System.out.println("6. 退出");
        System.out.println("7. 注销账户");
        System.out.println("请输入您要操作的命令：");
        int command = sc.nextInt();
        switch (command) {
            case 1:
                getAccountInfoByIdNum(account);
                operate(account, sc, accounts);
                break;
            case 2:
                setAccountMoney(sc, account, accounts);
                break;
            case 3:
                withdrawMoney(sc, account, accounts);
                break;
            case 4:
                double money = account.getBalance() <= account.getWithdrawalLimit() ? account.getBalance() : account.getWithdrawalLimit();
                double restMoney = transferAccountMoney(sc, accounts, money);
                account.setBalance(restMoney);
                operate(account, sc, accounts);
                break;
            case 5:
                updatePassword(sc, account, accounts);
                break;
            case 6:
                firstStepOperate(sc, accounts);
                break;
            case 7:
                logout(sc, account, accounts);
                break;
            default:
                System.out.println("您输入的命令有误");
        }
    }
}
