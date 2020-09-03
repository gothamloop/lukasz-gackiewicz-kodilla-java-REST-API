call runcrud
if "%ERRORLEVEL%" == "0" goto Edge
echo.
echo Run runcrud.bat has errors - breaking work.
goto fail

:Edge
call "C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe" http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL%" == "0" goto end
echo.
echo Opening Edge failed.
goto fail

:fail
echo.
echo There were errors
goto end

:end
echo.
echo Work is finished.