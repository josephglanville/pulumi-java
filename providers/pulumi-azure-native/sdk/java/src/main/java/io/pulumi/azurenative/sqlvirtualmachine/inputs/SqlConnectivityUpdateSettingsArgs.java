// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.ConnectivityType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set the access level and network port settings for SQL Server.
 * 
 */
public final class SqlConnectivityUpdateSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlConnectivityUpdateSettingsArgs Empty = new SqlConnectivityUpdateSettingsArgs();

    /**
     * SQL Server connectivity option.
     * 
     */
    @Import(name="connectivityType")
      private final @Nullable Output<Either<String,ConnectivityType>> connectivityType;

    public Output<Either<String,ConnectivityType>> getConnectivityType() {
        return this.connectivityType == null ? Codegen.empty() : this.connectivityType;
    }

    /**
     * SQL Server port.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * SQL Server sysadmin login password.
     * 
     */
    @Import(name="sqlAuthUpdatePassword")
      private final @Nullable Output<String> sqlAuthUpdatePassword;

    public Output<String> getSqlAuthUpdatePassword() {
        return this.sqlAuthUpdatePassword == null ? Codegen.empty() : this.sqlAuthUpdatePassword;
    }

    /**
     * SQL Server sysadmin login to create.
     * 
     */
    @Import(name="sqlAuthUpdateUserName")
      private final @Nullable Output<String> sqlAuthUpdateUserName;

    public Output<String> getSqlAuthUpdateUserName() {
        return this.sqlAuthUpdateUserName == null ? Codegen.empty() : this.sqlAuthUpdateUserName;
    }

    public SqlConnectivityUpdateSettingsArgs(
        @Nullable Output<Either<String,ConnectivityType>> connectivityType,
        @Nullable Output<Integer> port,
        @Nullable Output<String> sqlAuthUpdatePassword,
        @Nullable Output<String> sqlAuthUpdateUserName) {
        this.connectivityType = connectivityType;
        this.port = port;
        this.sqlAuthUpdatePassword = sqlAuthUpdatePassword;
        this.sqlAuthUpdateUserName = sqlAuthUpdateUserName;
    }

    private SqlConnectivityUpdateSettingsArgs() {
        this.connectivityType = Codegen.empty();
        this.port = Codegen.empty();
        this.sqlAuthUpdatePassword = Codegen.empty();
        this.sqlAuthUpdateUserName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectivityUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ConnectivityType>> connectivityType;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> sqlAuthUpdatePassword;
        private @Nullable Output<String> sqlAuthUpdateUserName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectivityUpdateSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityType = defaults.connectivityType;
    	      this.port = defaults.port;
    	      this.sqlAuthUpdatePassword = defaults.sqlAuthUpdatePassword;
    	      this.sqlAuthUpdateUserName = defaults.sqlAuthUpdateUserName;
        }

        public Builder connectivityType(@Nullable Output<Either<String,ConnectivityType>> connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }
        public Builder connectivityType(@Nullable Either<String,ConnectivityType> connectivityType) {
            this.connectivityType = Codegen.ofNullable(connectivityType);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder sqlAuthUpdatePassword(@Nullable Output<String> sqlAuthUpdatePassword) {
            this.sqlAuthUpdatePassword = sqlAuthUpdatePassword;
            return this;
        }
        public Builder sqlAuthUpdatePassword(@Nullable String sqlAuthUpdatePassword) {
            this.sqlAuthUpdatePassword = Codegen.ofNullable(sqlAuthUpdatePassword);
            return this;
        }
        public Builder sqlAuthUpdateUserName(@Nullable Output<String> sqlAuthUpdateUserName) {
            this.sqlAuthUpdateUserName = sqlAuthUpdateUserName;
            return this;
        }
        public Builder sqlAuthUpdateUserName(@Nullable String sqlAuthUpdateUserName) {
            this.sqlAuthUpdateUserName = Codegen.ofNullable(sqlAuthUpdateUserName);
            return this;
        }        public SqlConnectivityUpdateSettingsArgs build() {
            return new SqlConnectivityUpdateSettingsArgs(connectivityType, port, sqlAuthUpdatePassword, sqlAuthUpdateUserName);
        }
    }
}
