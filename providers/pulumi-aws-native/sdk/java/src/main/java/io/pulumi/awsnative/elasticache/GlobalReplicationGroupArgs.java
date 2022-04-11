// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache;

import io.pulumi.awsnative.elasticache.inputs.GlobalReplicationGroupMemberArgs;
import io.pulumi.awsnative.elasticache.inputs.GlobalReplicationGroupRegionalConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupArgs Empty = new GlobalReplicationGroupArgs();

    /**
     * AutomaticFailoverEnabled
     * 
     */
    @Import(name="automaticFailoverEnabled")
      private final @Nullable Output<Boolean> automaticFailoverEnabled;

    public Output<Boolean> getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled == null ? Codegen.empty() : this.automaticFailoverEnabled;
    }

    /**
     * The cache node type of the Global Datastore
     * 
     */
    @Import(name="cacheNodeType")
      private final @Nullable Output<String> cacheNodeType;

    public Output<String> getCacheNodeType() {
        return this.cacheNodeType == null ? Codegen.empty() : this.cacheNodeType;
    }

    /**
     * Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
     */
    @Import(name="cacheParameterGroupName")
      private final @Nullable Output<String> cacheParameterGroupName;

    public Output<String> getCacheParameterGroupName() {
        return this.cacheParameterGroupName == null ? Codegen.empty() : this.cacheParameterGroupName;
    }

    /**
     * The engine version of the Global Datastore.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * Indicates the number of node groups in the Global Datastore.
     * 
     */
    @Import(name="globalNodeGroupCount")
      private final @Nullable Output<Integer> globalNodeGroupCount;

    public Output<Integer> getGlobalNodeGroupCount() {
        return this.globalNodeGroupCount == null ? Codegen.empty() : this.globalNodeGroupCount;
    }

    /**
     * The optional description of the Global Datastore
     * 
     */
    @Import(name="globalReplicationGroupDescription")
      private final @Nullable Output<String> globalReplicationGroupDescription;

    public Output<String> getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription == null ? Codegen.empty() : this.globalReplicationGroupDescription;
    }

    /**
     * The suffix name of a Global Datastore. Amazon ElastiCache automatically applies a prefix to the Global Datastore ID when it is created. Each AWS Region has its own prefix.
     * 
     */
    @Import(name="globalReplicationGroupIdSuffix")
      private final @Nullable Output<String> globalReplicationGroupIdSuffix;

    public Output<String> getGlobalReplicationGroupIdSuffix() {
        return this.globalReplicationGroupIdSuffix == null ? Codegen.empty() : this.globalReplicationGroupIdSuffix;
    }

    /**
     * The replication groups that comprise the Global Datastore.
     * 
     */
    @Import(name="members", required=true)
      private final Output<List<GlobalReplicationGroupMemberArgs>> members;

    public Output<List<GlobalReplicationGroupMemberArgs>> getMembers() {
        return this.members;
    }

    /**
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each that comprise the Global Datastore
     * 
     */
    @Import(name="regionalConfigurations")
      private final @Nullable Output<List<GlobalReplicationGroupRegionalConfigurationArgs>> regionalConfigurations;

    public Output<List<GlobalReplicationGroupRegionalConfigurationArgs>> getRegionalConfigurations() {
        return this.regionalConfigurations == null ? Codegen.empty() : this.regionalConfigurations;
    }

    public GlobalReplicationGroupArgs(
        @Nullable Output<Boolean> automaticFailoverEnabled,
        @Nullable Output<String> cacheNodeType,
        @Nullable Output<String> cacheParameterGroupName,
        @Nullable Output<String> engineVersion,
        @Nullable Output<Integer> globalNodeGroupCount,
        @Nullable Output<String> globalReplicationGroupDescription,
        @Nullable Output<String> globalReplicationGroupIdSuffix,
        Output<List<GlobalReplicationGroupMemberArgs>> members,
        @Nullable Output<List<GlobalReplicationGroupRegionalConfigurationArgs>> regionalConfigurations) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
        this.cacheNodeType = cacheNodeType;
        this.cacheParameterGroupName = cacheParameterGroupName;
        this.engineVersion = engineVersion;
        this.globalNodeGroupCount = globalNodeGroupCount;
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
        this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.regionalConfigurations = regionalConfigurations;
    }

    private GlobalReplicationGroupArgs() {
        this.automaticFailoverEnabled = Codegen.empty();
        this.cacheNodeType = Codegen.empty();
        this.cacheParameterGroupName = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.globalNodeGroupCount = Codegen.empty();
        this.globalReplicationGroupDescription = Codegen.empty();
        this.globalReplicationGroupIdSuffix = Codegen.empty();
        this.members = Codegen.empty();
        this.regionalConfigurations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> automaticFailoverEnabled;
        private @Nullable Output<String> cacheNodeType;
        private @Nullable Output<String> cacheParameterGroupName;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<Integer> globalNodeGroupCount;
        private @Nullable Output<String> globalReplicationGroupDescription;
        private @Nullable Output<String> globalReplicationGroupIdSuffix;
        private Output<List<GlobalReplicationGroupMemberArgs>> members;
        private @Nullable Output<List<GlobalReplicationGroupRegionalConfigurationArgs>> regionalConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticFailoverEnabled = defaults.automaticFailoverEnabled;
    	      this.cacheNodeType = defaults.cacheNodeType;
    	      this.cacheParameterGroupName = defaults.cacheParameterGroupName;
    	      this.engineVersion = defaults.engineVersion;
    	      this.globalNodeGroupCount = defaults.globalNodeGroupCount;
    	      this.globalReplicationGroupDescription = defaults.globalReplicationGroupDescription;
    	      this.globalReplicationGroupIdSuffix = defaults.globalReplicationGroupIdSuffix;
    	      this.members = defaults.members;
    	      this.regionalConfigurations = defaults.regionalConfigurations;
        }

        public Builder automaticFailoverEnabled(@Nullable Output<Boolean> automaticFailoverEnabled) {
            this.automaticFailoverEnabled = automaticFailoverEnabled;
            return this;
        }
        public Builder automaticFailoverEnabled(@Nullable Boolean automaticFailoverEnabled) {
            this.automaticFailoverEnabled = Codegen.ofNullable(automaticFailoverEnabled);
            return this;
        }
        public Builder cacheNodeType(@Nullable Output<String> cacheNodeType) {
            this.cacheNodeType = cacheNodeType;
            return this;
        }
        public Builder cacheNodeType(@Nullable String cacheNodeType) {
            this.cacheNodeType = Codegen.ofNullable(cacheNodeType);
            return this;
        }
        public Builder cacheParameterGroupName(@Nullable Output<String> cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
            return this;
        }
        public Builder cacheParameterGroupName(@Nullable String cacheParameterGroupName) {
            this.cacheParameterGroupName = Codegen.ofNullable(cacheParameterGroupName);
            return this;
        }
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Codegen.ofNullable(engineVersion);
            return this;
        }
        public Builder globalNodeGroupCount(@Nullable Output<Integer> globalNodeGroupCount) {
            this.globalNodeGroupCount = globalNodeGroupCount;
            return this;
        }
        public Builder globalNodeGroupCount(@Nullable Integer globalNodeGroupCount) {
            this.globalNodeGroupCount = Codegen.ofNullable(globalNodeGroupCount);
            return this;
        }
        public Builder globalReplicationGroupDescription(@Nullable Output<String> globalReplicationGroupDescription) {
            this.globalReplicationGroupDescription = globalReplicationGroupDescription;
            return this;
        }
        public Builder globalReplicationGroupDescription(@Nullable String globalReplicationGroupDescription) {
            this.globalReplicationGroupDescription = Codegen.ofNullable(globalReplicationGroupDescription);
            return this;
        }
        public Builder globalReplicationGroupIdSuffix(@Nullable Output<String> globalReplicationGroupIdSuffix) {
            this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
            return this;
        }
        public Builder globalReplicationGroupIdSuffix(@Nullable String globalReplicationGroupIdSuffix) {
            this.globalReplicationGroupIdSuffix = Codegen.ofNullable(globalReplicationGroupIdSuffix);
            return this;
        }
        public Builder members(Output<List<GlobalReplicationGroupMemberArgs>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<GlobalReplicationGroupMemberArgs> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(GlobalReplicationGroupMemberArgs... members) {
            return members(List.of(members));
        }
        public Builder regionalConfigurations(@Nullable Output<List<GlobalReplicationGroupRegionalConfigurationArgs>> regionalConfigurations) {
            this.regionalConfigurations = regionalConfigurations;
            return this;
        }
        public Builder regionalConfigurations(@Nullable List<GlobalReplicationGroupRegionalConfigurationArgs> regionalConfigurations) {
            this.regionalConfigurations = Codegen.ofNullable(regionalConfigurations);
            return this;
        }
        public Builder regionalConfigurations(GlobalReplicationGroupRegionalConfigurationArgs... regionalConfigurations) {
            return regionalConfigurations(List.of(regionalConfigurations));
        }        public GlobalReplicationGroupArgs build() {
            return new GlobalReplicationGroupArgs(automaticFailoverEnabled, cacheNodeType, cacheParameterGroupName, engineVersion, globalNodeGroupCount, globalReplicationGroupDescription, globalReplicationGroupIdSuffix, members, regionalConfigurations);
        }
    }
}
