// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyEndpointArgs Empty = new ProxyEndpointArgs();

    /**
     * The identifier for the proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Import(name="dbProxyEndpointName", required=true)
      private final Output<String> dbProxyEndpointName;

    public Output<String> getDbProxyEndpointName() {
        return this.dbProxyEndpointName;
    }

    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * 
     */
    @Import(name="dbProxyName", required=true)
      private final Output<String> dbProxyName;

    public Output<String> getDbProxyName() {
        return this.dbProxyName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is `READ_WRITE`. Valid values are `READ_WRITE` and `READ_ONLY`.
     * 
     */
    @Import(name="targetRole")
      private final @Nullable Output<String> targetRole;

    public Output<String> getTargetRole() {
        return this.targetRole == null ? Codegen.empty() : this.targetRole;
    }

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Codegen.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    @Import(name="vpcSubnetIds", required=true)
      private final Output<List<String>> vpcSubnetIds;

    public Output<List<String>> getVpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    public ProxyEndpointArgs(
        Output<String> dbProxyEndpointName,
        Output<String> dbProxyName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetRole,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        Output<List<String>> vpcSubnetIds) {
        this.dbProxyEndpointName = Objects.requireNonNull(dbProxyEndpointName, "expected parameter 'dbProxyEndpointName' to be non-null");
        this.dbProxyName = Objects.requireNonNull(dbProxyName, "expected parameter 'dbProxyName' to be non-null");
        this.tags = tags;
        this.targetRole = targetRole;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds, "expected parameter 'vpcSubnetIds' to be non-null");
    }

    private ProxyEndpointArgs() {
        this.dbProxyEndpointName = Codegen.empty();
        this.dbProxyName = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetRole = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
        this.vpcSubnetIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dbProxyEndpointName;
        private Output<String> dbProxyName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetRole;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private Output<List<String>> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbProxyEndpointName = defaults.dbProxyEndpointName;
    	      this.dbProxyName = defaults.dbProxyName;
    	      this.tags = defaults.tags;
    	      this.targetRole = defaults.targetRole;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder dbProxyEndpointName(Output<String> dbProxyEndpointName) {
            this.dbProxyEndpointName = Objects.requireNonNull(dbProxyEndpointName);
            return this;
        }
        public Builder dbProxyEndpointName(String dbProxyEndpointName) {
            this.dbProxyEndpointName = Output.of(Objects.requireNonNull(dbProxyEndpointName));
            return this;
        }
        public Builder dbProxyName(Output<String> dbProxyName) {
            this.dbProxyName = Objects.requireNonNull(dbProxyName);
            return this;
        }
        public Builder dbProxyName(String dbProxyName) {
            this.dbProxyName = Output.of(Objects.requireNonNull(dbProxyName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetRole(@Nullable Output<String> targetRole) {
            this.targetRole = targetRole;
            return this;
        }
        public Builder targetRole(@Nullable String targetRole) {
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
        }        public ProxyEndpointArgs build() {
            return new ProxyEndpointArgs(dbProxyEndpointName, dbProxyName, tags, targetRole, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}
