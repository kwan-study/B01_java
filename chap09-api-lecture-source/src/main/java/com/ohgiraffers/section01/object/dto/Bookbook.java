package com.ohgiraffers.section01.object.dto;

import java.util.Objects;

public class Bookbook {
        private int number;
        private String title;
        private String author;
        private int price;

        public Bookbook() {
        }

        public Bookbook(int number, String title, String author, int price) {
            this.number = number;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Bookbook{" +
                    "number=" + number +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }

//    @Override
//    public boolean equals(Object obj) {
//
//        /* 설명. 책제목, 작가, 가격이 같으면(동등 기준) true가 나올 수 있게 equals()메소드 재정의 */
//        return this.title.equals(((Bookbook)obj).title) &&
//                this.author.equals(((Bookbook)obj).author) &&
//                this.price == ((Bookbook)obj).price;
//    }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            com.ohgiraffers.section01.object.dto.Bookbook bookDTO = (com.ohgiraffers.section01.object.dto.Bookbook) o;
            return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number,title, author, price);
        }
    }

