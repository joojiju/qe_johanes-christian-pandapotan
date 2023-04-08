@Sepulsa
  Feature: Sepulsa
    @Login @NormalPositive
    Scenario: User can login with VALID username and password
      Given user is on sepulsa landing page
      When user click on masuk button
      And user input VALID sepulsa username "jayaxe4910@duiter.com"
      And user input VALID sepulsa password "ini Passw0rd_"
      And user click on masuk button to login
      And user click on beranda button
      Then user succesfully logged in to sepulsa and see "Lihat Semua" text

    @Login @NormalNegative
    Scenario: User can login with INVALID username and password
      Given user is on sepulsa landing page
      When user click on masuk button
      And user input INVALID sepulsa username "adwiqd"
      And user input INVALID sepulsa password "dqwdo20"
      And user click on masuk button to login
      Then user cannot logged in to sepulsa and see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

    @Login @NormalNegative
    Scenario: User can login with VALID username and INVALID password
      Given user is on sepulsa landing page
      When user click on masuk button
      And user input VALID sepulsa username "jayaxe4910@duiter.com"
      And user input INVALID sepulsa password "dqwdo20"
      And user click on masuk button to login
      Then user cannot logged in to sepulsa and see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

    @Login @NormalNegative
    Scenario: User can login with INVALID username and VALID password
      Given user is on sepulsa landing page
      When user click on masuk button
      And user input INVALID sepulsa username "adwiqd"
      And user input VALID sepulsa password "ini Passw0rd_"
      And user click on masuk button to login
      Then user cannot logged in to sepulsa and see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

    @Product @NormalPositive
    Scenario: User choose product pulsa telkomsel with VALID number
      Given user is on sepulsa landing page
      When user click on pulsa button
      And user input nomor handphone "082122567830"
      And user click on harga Rp5.000 card
      Then user redirected to payment confirmation page and see "Total Pembayaran" text

