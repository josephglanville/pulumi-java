// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RdsDbInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RdsDbInstanceArgs Empty = new RdsDbInstanceArgs();

    /**
     * A db password
     * 
     */
    @Import(name="dbPassword", required=true)
      private final Output<String> dbPassword;

    public Output<String> getDbPassword() {
        return this.dbPassword;
    }

    /**
     * A db username
     * 
     */
    @Import(name="dbUser", required=true)
      private final Output<String> dbUser;

    public Output<String> getDbUser() {
        return this.dbUser;
    }

    /**
     * The db instance to register for this stack. Changing this will force a new resource.
     * 
     */
    @Import(name="rdsDbInstanceArn", required=true)
      private final Output<String> rdsDbInstanceArn;

    public Output<String> getRdsDbInstanceArn() {
        return this.rdsDbInstanceArn;
    }

    /**
     * The stack to register a db instance for. Changing this will force a new resource.
     * 
     */
    @Import(name="stackId", required=true)
      private final Output<String> stackId;

    public Output<String> getStackId() {
        return this.stackId;
    }

    public RdsDbInstanceArgs(
        Output<String> dbPassword,
        Output<String> dbUser,
        Output<String> rdsDbInstanceArn,
        Output<String> stackId) {
        this.dbPassword = Objects.requireNonNull(dbPassword, "expected parameter 'dbPassword' to be non-null");
        this.dbUser = Objects.requireNonNull(dbUser, "expected parameter 'dbUser' to be non-null");
        this.rdsDbInstanceArn = Objects.requireNonNull(rdsDbInstanceArn, "expected parameter 'rdsDbInstanceArn' to be non-null");
        this.stackId = Objects.requireNonNull(stackId, "expected parameter 'stackId' to be non-null");
    }

    private RdsDbInstanceArgs() {
        this.dbPassword = Output.empty();
        this.dbUser = Output.empty();
        this.rdsDbInstanceArn = Output.empty();
        this.stackId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RdsDbInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dbPassword;
        private Output<String> dbUser;
        private Output<String> rdsDbInstanceArn;
        private Output<String> stackId;

        public Builder() {
    	      // Empty
        }

        public Builder(RdsDbInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbPassword = defaults.dbPassword;
    	      this.dbUser = defaults.dbUser;
    	      this.rdsDbInstanceArn = defaults.rdsDbInstanceArn;
    	      this.stackId = defaults.stackId;
        }

        public Builder dbPassword(Output<String> dbPassword) {
            this.dbPassword = Objects.requireNonNull(dbPassword);
            return this;
        }
        public Builder dbPassword(String dbPassword) {
            this.dbPassword = Output.of(Objects.requireNonNull(dbPassword));
            return this;
        }
        public Builder dbUser(Output<String> dbUser) {
            this.dbUser = Objects.requireNonNull(dbUser);
            return this;
        }
        public Builder dbUser(String dbUser) {
            this.dbUser = Output.of(Objects.requireNonNull(dbUser));
            return this;
        }
        public Builder rdsDbInstanceArn(Output<String> rdsDbInstanceArn) {
            this.rdsDbInstanceArn = Objects.requireNonNull(rdsDbInstanceArn);
            return this;
        }
        public Builder rdsDbInstanceArn(String rdsDbInstanceArn) {
            this.rdsDbInstanceArn = Output.of(Objects.requireNonNull(rdsDbInstanceArn));
            return this;
        }
        public Builder stackId(Output<String> stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }
        public Builder stackId(String stackId) {
            this.stackId = Output.of(Objects.requireNonNull(stackId));
            return this;
        }        public RdsDbInstanceArgs build() {
            return new RdsDbInstanceArgs(dbPassword, dbUser, rdsDbInstanceArn, stackId);
        }
    }
}
