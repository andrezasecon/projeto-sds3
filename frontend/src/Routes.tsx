import Dashboard from "pages/dashboard";
import Home from "pages/home";
import {BrowserRouter, Switch, Route} from "react-router-dom";

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home/>
                </Route>

                <Route path="/dashboard" >
                    <Dashboard/>
                </Route>
            </Switch>     
        </BrowserRouter>
        
      
    );
  }
  
  export default Routes; 