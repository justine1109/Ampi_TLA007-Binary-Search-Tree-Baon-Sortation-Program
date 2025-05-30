package com.mycompany.ampi_tla7;

class Student {
    String name;
    int baon;

    public Student(String name, int baon) {
        this.name = name;
        this.baon = baon;
    }

    @Override
    public String toString() {
        return name + " - " + baon;
    }
}

class BSTNode {
    Student data;
    BSTNode left, right;

    public BSTNode(Student data) {
        this.data = data;
        left = right = null;
    }
}

class BaonBST {
    BSTNode root;

    public void insert(Student data) {
        root = insertRec(root, data);
    }

    private BSTNode insertRec(BSTNode root, Student data) {
        if (root == null) return new BSTNode(data);

        if (data.baon > root.data.baon)
            root.left = insertRec(root.left, data);
        else
            root.right = insertRec(root.right, data);

        return root;
    }

    public void printDescending() {
        printRec(root);
    }

    private void printRec(BSTNode root) {
        if (root != null) {
            printRec(root.left);  
            System.out.println(root.data);
            printRec(root.right);
        }
    }
}
// MEMBERS; AMPI,DAEL, AND UNDANGAN
