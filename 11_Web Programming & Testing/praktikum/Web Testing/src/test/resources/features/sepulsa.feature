@Sepulsa
Feature: Sepulsa
  @LoginSepulsa @NormalPositive
  Scenario: User can login with valid username and valid password
    Given user is on sepulsa home page
    When user click on the masuk button
    And user input valid sepulsa username "jayaxe4910@duiter.com"
    And user input valid sepulsa password "ini Passw0rd_"
    And user click on the submit login button
    And user click on the akun button on navbar
    Then user can see their profile page and this text "Lihat & ubah profil"

  @LoginSepulsa @NormalNegative
  Scenario: User can't login with invalid username and invalid password
    Given user is on sepulsa home page
    When user click on the masuk button
    And user input invalid sepulsa username "1ewqe"
    And user input invalid sepulsa password "qwedsx"
    And user click on the submit login button
    Then user see this "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih." alert message invalid account

  @ProductSepulsa @NormalPositive
  Scenario: User can choose Pulsa Telkomsel 20 ribu
    Given user is on sepulsa home page
    When user click on the pulsa button on menu
    And user input nomor handphone "082134567899"
    And user choose nominal 20 ribu
    Then user can see "Total Pembayaran" checkout page

  @ProductSepulsa @NormalPositive
  Scenario: User can choose GoPay Top Up Nominal 25 ribu
    Given user is on sepulsa home page
    When user click on the uang elektronik button on menu
    And user click on the Go-Pay button
    And user input nomor handphone "082144567899"
    And user choose nominal 25 ribu
    Then user can see "Total Pembayaran" checkout page

  @ProductSepulsa @NormalNegative
  Scenario: User can't choose product nominal that is not available
    Given user is on sepulsa home page
    When user click on the voucher game button on menu
    And user click on the Twitch button
    And user input nomor handphone "082154567899"
    Then user can see "Maaf, lagi nggak tersedia." on nominal page

  @PaymentSepulsa @NormalPositive
  Scenario: User can checkout ShopeePay Top Up with GoPay Payment
    Given user is logged in on sepulsa with username "jayaxe4910@duiter.com" and password "ini Passw0rd_"
    When user click on the uang elektronik button on menu
    And user click on the ShopeePay button
    And user input nomor handphone "082164567899"
    And user choose nominal 15 ribu
    And user can see "Total Pembayaran" checkout page
    And user click on the GoPay payment method
    Then user click on the Bayar Sekarang button

  @PaymentSepulsa @NormalNegative
  Scenario: User can't checkout ShopeePay Top Up because haven't choose the payment method yet
    Given user is logged in on sepulsa with username "jayaxe4910@duiter.com" and password "ini Passw0rd_"
    When user click on the uang elektronik button on menu
    And user click on the ShopeePay button
    And user input nomor handphone "082174567899"
    And user choose nominal 15 ribu
    And user can see "Total Pembayaran" checkout page
    And user click on the Bayar Sekarang button
    Then user can see "Kamu belum memilih metode pembayaran" on checkout page