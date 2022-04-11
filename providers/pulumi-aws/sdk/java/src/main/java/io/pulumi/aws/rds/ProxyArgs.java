// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.rds.inputs.ProxyAuthArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyArgs Empty = new ProxyArgs();

    /**
     * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
     * 
     */
    @Import(name="auths", required=true)
      private final Output<List<ProxyAuthArgs>> auths;

    public Output<List<ProxyAuthArgs>> getAuths() {
        return this.auths;
    }

    /**
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
     * 
     */
    @Import(name="debugLogging")
      private final @Nullable Output<Boolean> debugLogging;

    public Output<Boolean> getDebugLogging() {
        return this.debugLogging == null ? Codegen.empty() : this.debugLogging;
    }

    /**
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora. Valid values are `MYSQL` and `POSTGRESQL`.
     * 
     */
    @Import(name="engineFamily", required=true)
      private final Output<String> engineFamily;

    public Output<String> getEngineFamily() {
        return this.engineFamily;
    }

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
     * 
     */
    @Import(name="idleClientTimeout")
      private final @Nullable Output<Integer> idleClientTimeout;

    public Output<Integer> getIdleClientTimeout() {
        return this.idleClientTimeout == null ? Codegen.empty() : this.idleClientTimeout;
    }

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * 
     */
    @Import(name="requireTls")
      private final @Nullable Output<Boolean> requireTls;

    public Output<Boolean> getRequireTls() {
        return this.requireTls == null ? Codegen.empty() : this.requireTls;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A mapping of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
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

    public ProxyArgs(
        Output<List<ProxyAuthArgs>> auths,
        @Nullable Output<Boolean> debugLogging,
        Output<String> engineFamily,
        @Nullable Output<Integer> idleClientTimeout,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> requireTls,
        Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        Output<List<String>> vpcSubnetIds) {
        this.auths = Objects.requireNonNull(auths, "expected parameter 'auths' to be non-null");
        this.debugLogging = debugLogging;
        this.engineFamily = Objects.requireNonNull(engineFamily, "expected parameter 'engineFamily' to be non-null");
        this.idleClientTimeout = idleClientTimeout;
        this.name = name;
        this.requireTls = requireTls;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds, "expected parameter 'vpcSubnetIds' to be non-null");
    }

    private ProxyArgs() {
        this.auths = Codegen.empty();
        this.debugLogging = Codegen.empty();
        this.engineFamily = Codegen.empty();
        this.idleClientTimeout = Codegen.empty();
        this.name = Codegen.empty();
        this.requireTls = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
        this.vpcSubnetIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ProxyAuthArgs>> auths;
        private @Nullable Output<Boolean> debugLogging;
        private Output<String> engineFamily;
        private @Nullable Output<Integer> idleClientTimeout;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> requireTls;
        private Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private Output<List<String>> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auths = defaults.auths;
    	      this.debugLogging = defaults.debugLogging;
    	      this.engineFamily = defaults.engineFamily;
    	      this.idleClientTimeout = defaults.idleClientTimeout;
    	      this.name = defaults.name;
    	      this.requireTls = defaults.requireTls;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder auths(Output<List<ProxyAuthArgs>> auths) {
            this.auths = Objects.requireNonNull(auths);
            return this;
        }
        public Builder auths(List<ProxyAuthArgs> auths) {
            this.auths = Output.of(Objects.requireNonNull(auths));
            return this;
        }
        public Builder auths(ProxyAuthArgs... auths) {
            return auths(List.of(auths));
        }
        public Builder debugLogging(@Nullable Output<Boolean> debugLogging) {
            this.debugLogging = debugLogging;
            return this;
        }
        public Builder debugLogging(@Nullable Boolean debugLogging) {
            this.debugLogging = Codegen.ofNullable(debugLogging);
            return this;
        }
        public Builder engineFamily(Output<String> engineFamily) {
            this.engineFamily = Objects.requireNonNull(engineFamily);
            return this;
        }
        public Builder engineFamily(String engineFamily) {
            this.engineFamily = Output.of(Objects.requireNonNull(engineFamily));
            return this;
        }
        public Builder idleClientTimeout(@Nullable Output<Integer> idleClientTimeout) {
            this.idleClientTimeout = idleClientTimeout;
            return this;
        }
        public Builder idleClientTimeout(@Nullable Integer idleClientTimeout) {
            this.idleClientTimeout = Codegen.ofNullable(idleClientTimeout);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder requireTls(@Nullable Output<Boolean> requireTls) {
            this.requireTls = requireTls;
            return this;
        }
        public Builder requireTls(@Nullable Boolean requireTls) {
            this.requireTls = Codegen.ofNullable(requireTls);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
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
        }        public ProxyArgs build() {
            return new ProxyArgs(auths, debugLogging, engineFamily, idleClientTimeout, name, requireTls, roleArn, tags, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}
