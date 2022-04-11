// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.DatasourceArgs;
import io.pulumi.azurenative.dataprotection.inputs.DatasourceSetArgs;
import io.pulumi.azurenative.dataprotection.inputs.PolicyInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backup Instance
 * 
 */
public final class BackupInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupInstanceArgs Empty = new BackupInstanceArgs();

    /**
     * Gets or sets the data source information.
     * 
     */
    @Import(name="dataSourceInfo", required=true)
      private final Output<DatasourceArgs> dataSourceInfo;

    public Output<DatasourceArgs> getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Gets or sets the data source set information.
     * 
     */
    @Import(name="dataSourceSetInfo")
      private final @Nullable Output<DatasourceSetArgs> dataSourceSetInfo;

    public Output<DatasourceSetArgs> getDataSourceSetInfo() {
        return this.dataSourceSetInfo == null ? Codegen.empty() : this.dataSourceSetInfo;
    }

    /**
     * Gets or sets the Backup Instance friendly name.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    @Import(name="objectType", required=true)
      private final Output<String> objectType;

    public Output<String> getObjectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the policy information.
     * 
     */
    @Import(name="policyInfo", required=true)
      private final Output<PolicyInfoArgs> policyInfo;

    public Output<PolicyInfoArgs> getPolicyInfo() {
        return this.policyInfo;
    }

    public BackupInstanceArgs(
        Output<DatasourceArgs> dataSourceInfo,
        @Nullable Output<DatasourceSetArgs> dataSourceSetInfo,
        @Nullable Output<String> friendlyName,
        Output<String> objectType,
        Output<PolicyInfoArgs> policyInfo) {
        this.dataSourceInfo = Objects.requireNonNull(dataSourceInfo, "expected parameter 'dataSourceInfo' to be non-null");
        this.dataSourceSetInfo = dataSourceSetInfo;
        this.friendlyName = friendlyName;
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.policyInfo = Objects.requireNonNull(policyInfo, "expected parameter 'policyInfo' to be non-null");
    }

    private BackupInstanceArgs() {
        this.dataSourceInfo = Codegen.empty();
        this.dataSourceSetInfo = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.objectType = Codegen.empty();
        this.policyInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DatasourceArgs> dataSourceInfo;
        private @Nullable Output<DatasourceSetArgs> dataSourceSetInfo;
        private @Nullable Output<String> friendlyName;
        private Output<String> objectType;
        private Output<PolicyInfoArgs> policyInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceInfo = defaults.dataSourceInfo;
    	      this.dataSourceSetInfo = defaults.dataSourceSetInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.objectType = defaults.objectType;
    	      this.policyInfo = defaults.policyInfo;
        }

        public Builder dataSourceInfo(Output<DatasourceArgs> dataSourceInfo) {
            this.dataSourceInfo = Objects.requireNonNull(dataSourceInfo);
            return this;
        }
        public Builder dataSourceInfo(DatasourceArgs dataSourceInfo) {
            this.dataSourceInfo = Output.of(Objects.requireNonNull(dataSourceInfo));
            return this;
        }
        public Builder dataSourceSetInfo(@Nullable Output<DatasourceSetArgs> dataSourceSetInfo) {
            this.dataSourceSetInfo = dataSourceSetInfo;
            return this;
        }
        public Builder dataSourceSetInfo(@Nullable DatasourceSetArgs dataSourceSetInfo) {
            this.dataSourceSetInfo = Codegen.ofNullable(dataSourceSetInfo);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder objectType(Output<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Output.of(Objects.requireNonNull(objectType));
            return this;
        }
        public Builder policyInfo(Output<PolicyInfoArgs> policyInfo) {
            this.policyInfo = Objects.requireNonNull(policyInfo);
            return this;
        }
        public Builder policyInfo(PolicyInfoArgs policyInfo) {
            this.policyInfo = Output.of(Objects.requireNonNull(policyInfo));
            return this;
        }        public BackupInstanceArgs build() {
            return new BackupInstanceArgs(dataSourceInfo, dataSourceSetInfo, friendlyName, objectType, policyInfo);
        }
    }
}
