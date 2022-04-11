// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.rds.enums.DBProxyEndpointTargetRole;
import io.pulumi.awsnative.rds.inputs.DBProxyEndpointTagFormatArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DBProxyEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final DBProxyEndpointArgs Empty = new DBProxyEndpointArgs();

    /**
     * The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyEndpointName")
      private final @Nullable Output<String> dBProxyEndpointName;

    public Output<String> getDBProxyEndpointName() {
        return this.dBProxyEndpointName == null ? Codegen.empty() : this.dBProxyEndpointName;
    }

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyName", required=true)
      private final Output<String> dBProxyName;

    public Output<String> getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DBProxyEndpointTagFormatArgs>> tags;

    public Output<List<DBProxyEndpointTagFormatArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * 
     */
    @Import(name="targetRole")
      private final @Nullable Output<DBProxyEndpointTargetRole> targetRole;

    public Output<DBProxyEndpointTargetRole> getTargetRole() {
        return this.targetRole == null ? Codegen.empty() : this.targetRole;
    }

    /**
     * VPC security group IDs to associate with the new DB proxy endpoint.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Codegen.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * VPC subnet IDs to associate with the new DB proxy endpoint.
     * 
     */
    @Import(name="vpcSubnetIds", required=true)
      private final Output<List<String>> vpcSubnetIds;

    public Output<List<String>> getVpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    public DBProxyEndpointArgs(
        @Nullable Output<String> dBProxyEndpointName,
        Output<String> dBProxyName,
        @Nullable Output<List<DBProxyEndpointTagFormatArgs>> tags,
        @Nullable Output<DBProxyEndpointTargetRole> targetRole,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        Output<List<String>> vpcSubnetIds) {
        this.dBProxyEndpointName = dBProxyEndpointName;
        this.dBProxyName = Objects.requireNonNull(dBProxyName, "expected parameter 'dBProxyName' to be non-null");
        this.tags = tags;
        this.targetRole = targetRole;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds, "expected parameter 'vpcSubnetIds' to be non-null");
    }

    private DBProxyEndpointArgs() {
        this.dBProxyEndpointName = Codegen.empty();
        this.dBProxyName = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetRole = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
        this.vpcSubnetIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dBProxyEndpointName;
        private Output<String> dBProxyName;
        private @Nullable Output<List<DBProxyEndpointTagFormatArgs>> tags;
        private @Nullable Output<DBProxyEndpointTargetRole> targetRole;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private Output<List<String>> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dBProxyEndpointName = defaults.dBProxyEndpointName;
    	      this.dBProxyName = defaults.dBProxyName;
    	      this.tags = defaults.tags;
    	      this.targetRole = defaults.targetRole;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder dBProxyEndpointName(@Nullable Output<String> dBProxyEndpointName) {
            this.dBProxyEndpointName = dBProxyEndpointName;
            return this;
        }
        public Builder dBProxyEndpointName(@Nullable String dBProxyEndpointName) {
            this.dBProxyEndpointName = Codegen.ofNullable(dBProxyEndpointName);
            return this;
        }
        public Builder dBProxyName(Output<String> dBProxyName) {
            this.dBProxyName = Objects.requireNonNull(dBProxyName);
            return this;
        }
        public Builder dBProxyName(String dBProxyName) {
            this.dBProxyName = Output.of(Objects.requireNonNull(dBProxyName));
            return this;
        }
        public Builder tags(@Nullable Output<List<DBProxyEndpointTagFormatArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DBProxyEndpointTagFormatArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DBProxyEndpointTagFormatArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder targetRole(@Nullable Output<DBProxyEndpointTargetRole> targetRole) {
            this.targetRole = targetRole;
            return this;
        }
        public Builder targetRole(@Nullable DBProxyEndpointTargetRole targetRole) {
            this.targetRole = Codegen.ofNullable(targetRole);
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Codegen.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        public Builder vpcSubnetIds(Output<List<String>> vpcSubnetIds) {
            this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds);
            return this;
        }
        public Builder vpcSubnetIds(List<String> vpcSubnetIds) {
            this.vpcSubnetIds = Output.of(Objects.requireNonNull(vpcSubnetIds));
            return this;
        }
        public Builder vpcSubnetIds(String... vpcSubnetIds) {
            return vpcSubnetIds(List.of(vpcSubnetIds));
        }        public DBProxyEndpointArgs build() {
            return new DBProxyEndpointArgs(dBProxyEndpointName, dBProxyName, tags, targetRole, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}
