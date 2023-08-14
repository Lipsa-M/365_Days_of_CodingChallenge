data <- data.frame(
  Format = c("Test", "ODI", "T20I", "FC", "ListA", "T20"),
  Matches = c(200, 463, 1, 310, 551, 96),
  Inns = c(329, 452, 1, 490, 538, 96),
  NO = c(33, 41, 0, 51, 55, 11),
  Runs = c(15921, 18426, 10, 25396, 21999, 2797),
  HS = c(248, 200, 10, 248, 200, 100),
  BF = c(29437, 21368, 12, NA, NA, 2310),
  Sixes = c(69, 195, 0, NA, NA, 29),
  Fours = c(2058, 2016, 2, NA, NA, 359)
)
data$SR <- data$Runs / data$BF * 100
data$Avg <- data$Runs / (data$Inns - data$NO)

print(data)
