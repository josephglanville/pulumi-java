// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties required to create a connection to Azure SQL database Managed instance
 * 
 */
public final class MiSqlConnectionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final MiSqlConnectionInfoArgs Empty = new MiSqlConnectionInfoArgs();

    /**
     * Resource id for Azure SQL database Managed instance
     * 
     */
    @InputImport(name="managedInstanceResourceId", required=true)
      private final Input<String> managedInstanceResourceId;

    public Input<String> getManagedInstanceResourceId() {
        return this.managedInstanceResourceId;
    }

    /**
     * Password credential.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Type of connection info
     * Expected value is 'MiSqlConnectionInfo'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public MiSqlConnectionInfoArgs(
        Input<String> managedInstanceResourceId,
        @Nullable Input<String> password,
        Input<String> type,
        @Nullable Input<String> userName) {
        this.managedInstanceResourceId = Objects.requireNonNull(managedInstanceResourceId, "expected parameter 'managedInstanceResourceId' to be non-null");
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private MiSqlConnectionInfoArgs() {
        this.managedInstanceResourceId = Input.empty();
        this.password = Input.empty();
        this.type = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MiSqlConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> managedInstanceResourceId;
        private @Nullable Input<String> password;
        private Input<String> type;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MiSqlConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedInstanceResourceId = defaults.managedInstanceResourceId;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setManagedInstanceResourceId(Input<String> managedInstanceResourceId) {
            this.managedInstanceResourceId = Objects.requireNonNull(managedInstanceResourceId);
            return this;
        }

        public Builder setManagedInstanceResourceId(String managedInstanceResourceId) {
            this.managedInstanceResourceId = Input.of(Objects.requireNonNull(managedInstanceResourceId));
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public MiSqlConnectionInfoArgs build() {
            return new MiSqlConnectionInfoArgs(managedInstanceResourceId, password, type, userName);
        }
    }
}
