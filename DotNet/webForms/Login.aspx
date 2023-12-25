<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="File_work.Login" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <center>
        <h1>User Login</h1>
        <form id="form1" runat="server">
            <table>
                <tr>
                    <td>
                        <p>Email</p>
                    </td>
                    <td>
                        <asp:TextBox ID="txtEmail" runat="server" TextMode="Email"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Password</p>
                    </td>
                    <td>
                        <asp:TextBox ID="txtPass" runat="server" TextMode="Password"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <center>
                            <asp:Button ID="btnSubmit" runat="server" Text="Login" OnClick="btnSubmit_Click"/>
                        </center>
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
