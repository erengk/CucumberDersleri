Feature: DataTable Ornek

  Scenario: Users List
    When Write username "gokhan"
    And Write username and Password "gokhan" and "1234"
    And Write username as DataTable
      | gokhan |
      | mehmet |
      | ayşe   |
      | kaya   |

    And Write username and password as DataTable
      | gokhan | 1234 |
      | mehmet | 2324 |
      | ayşe   | 4545 |
      | kaya   | 4554 |