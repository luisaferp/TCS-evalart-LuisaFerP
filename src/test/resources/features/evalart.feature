#language:en
@Regresion
Feature: Contabilizar cada imagen parecida dentro de un conjunto en Evalart
  Como un usuario
  Quiero ingresar a evalart
  Para resolver cada ejercicio

  @CasoDePrueba1
  Scenario Outline: Resolver Problemas de imagenes y Fechas
    Given que Luisa ingresa a Evalart
    When Inicia Sesion con las credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And Resuelve cada incognita propuesta
      | imagen1   | fecha1   | imagen2   | fecha2   | imagen3   | fecha3   | imagen4   | fecha4   | imagen5   | fecha5   | imagen6   | fecha6   | imagen7   | fecha7   | imagen8   | fecha8   | imagen9   | fecha9   | imagen10   | fecha10   |
      | <imagen1> | <fecha1> | <imagen2> | <fecha2> | <imagen3> | <fecha3> | <imagen4> | <fecha4> | <imagen5> | <fecha5> | <imagen6> | <fecha6> | <imagen7> | <fecha7> | <imagen8> | <fecha8> | <imagen9> | <fecha9> | <imagen10> | <fecha10> |
    Then Verifica el codigo Hash
      | hash   |
      | <hash> |

    Examples:
      | usuario | contrasena                                       | imagen1 | fecha1     | imagen2 | fecha2     | imagen3 | fecha3     | imagen4 | fecha4     | imagen5 | fecha5     | imagen6 | fecha6     | imagen7 | fecha7     | imagen8 | fecha8     | imagen9 | fecha9     | imagen10 | fecha10    | hash                                                      |
      | 825027  | 10df2f32286b7120MS00LTcyMDUyOA==30e0c83e6c29f1c3 | 12      | 26/02/2024 | 19      | 15/08/2024 | 11      | 28/01/2024 | 11      | 26/01/2024 | 18      | 21/12/2023 | 19      | 29/12/2023 | 15      | 19/02/2024 | 11      | 02/08/2024 | 10      | 12/05/2024 | 19       | 07/02/2024 | <General>c2fe0e21ce445033MS00LTcyMDUyOA==df63afbf4da3d4b1 |






