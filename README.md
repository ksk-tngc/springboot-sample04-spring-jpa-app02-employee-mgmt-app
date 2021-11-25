## 概要

以下の要素を含む簡単な Spring Boot アプリケーションです。

* Spring Data JPA で CRUD 操作
* CommandLineRunner を実装したコンポーネントを定義し、  
  Spring Boot 起動時に DB 初期データを登録するコマンドラインを実行
* Thymeleaf Layout Dialect で各画面のレイアウトを共通化
* オフキャンバスメニューのレスポンシブ対応
* 共通エラーページ
* バリデーション実装
* WebJars で Bootstrap, Bootstrap Icons, jQuery 導入

## 画面

#### 初期表示（社員一覧）  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128454073-bb577e60-9bee-4c84-8fca-0f448a610b7f.png">  
<img width="85%" alt="h2" src="https://user-images.githubusercontent.com/59589496/128457436-36444d6f-9743-4710-aef2-835338946173.png">  
<img width="85%" alt="h2" src="https://user-images.githubusercontent.com/59589496/128457516-2cadd82f-a52f-4d24-8ada-cf87e0d73e1b.png">  

#### 登録  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128454298-56a92a3b-33ac-437d-b1e2-3247eb1f306b.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128454394-e4108e1d-5afc-43ff-9797-82e231fb9946.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128454650-48ded9c7-f85d-4216-9553-8752c67abb6e.png">  
<img width="85%" alt="h2" src="https://user-images.githubusercontent.com/59589496/128454790-8848aadb-4588-4e03-a4d2-601b9fec78bd.png">  

#### 編集  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128454939-575cf0e4-0cfe-4b1d-a12a-6da47f6ac210.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128455138-44255511-2fa2-44d8-8b8b-7127edb43f72.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128455247-9e5dd480-c5bd-47c0-bf0c-03804bc97518.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128455328-cf615291-ebfe-4e70-b196-ef642ffb2cc5.png">  
<img width="85%" alt="h2" src="https://user-images.githubusercontent.com/59589496/128455444-0c6d9fa2-9707-4fb6-b5aa-db73ab3d647f.png">  

#### 削除    
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128455995-650b5769-4f91-45bb-b58a-a8fd56b1b68e.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128456617-74fa04a7-fa4c-4ac7-9664-a8bfc4015200.png">  
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128456460-5233297d-1f02-4743-9bd3-081a6ad472c2.png">  
<img width="85%" alt="h2" src="https://user-images.githubusercontent.com/59589496/128456669-1521cc8e-2843-4eea-a348-f20b49d48e86.png">  

#### 共通エラーページ    
<img width="1200" src="https://user-images.githubusercontent.com/59589496/128456782-4dd5d534-c194-43ec-b36e-eee9ecf186c5.png">  

#### オフキャンバスメニューのレスポンシブ対応    
<img width="600" src="https://user-images.githubusercontent.com/59589496/128457083-c99d8724-6457-414c-ba2e-ab9adf855d92.png">  
<img width="600" src="https://user-images.githubusercontent.com/59589496/128457188-5cc6bd4a-6977-41bc-9d3d-0300bae0ce89.png">  

## フォルダ構成

<img width="300" src="https://user-images.githubusercontent.com/59589496/128458144-0c3f7df5-fcb5-40a4-9850-606a19549a15.png">  

## 依存関係

* Spring Boot DevTools
* Thymeleaf
* Thymeleaf Layout Dialect
* Spring Web
* Validation
* Spring Data JPA
* H2 Database
* Lombok
* WebJars
  - Bootstrap
  - Bootstrap Icons
  - jQuery
