SELECT * FROM Company.EarningsDate, Company where earningsDate = '2016-05-18' and jpmOpinion = 'Overweight' and EarningsDate.companyId = Company.id;