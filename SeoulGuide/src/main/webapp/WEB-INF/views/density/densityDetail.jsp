<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Density Detail</title>
</head>
<body>
	<h2>${cityDataResponse.getCityData().getAreaName()}</h2>
	<p>Congestion Level: ${cityDataResponse.cityData.outerLivePopulationStatus.innerLivePopulationStatus.areaCongestLevel}</p>

	<p>Congestion Message:
		${cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestMessage()}</p>


</body>
</html>
