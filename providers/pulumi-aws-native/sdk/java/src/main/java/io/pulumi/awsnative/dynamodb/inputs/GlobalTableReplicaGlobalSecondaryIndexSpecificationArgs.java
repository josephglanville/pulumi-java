// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableContributorInsightsSpecificationArgs;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReadProvisionedThroughputSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs Empty = new GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs();

    @Import(name="contributorInsightsSpecification")
      private final @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification;

    public Output<GlobalTableContributorInsightsSpecificationArgs> getContributorInsightsSpecification() {
        return this.contributorInsightsSpecification == null ? Codegen.empty() : this.contributorInsightsSpecification;
    }

    @Import(name="indexName", required=true)
      private final Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName;
    }

    @Import(name="readProvisionedThroughputSettings")
      private final @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings;

    public Output<GlobalTableReadProvisionedThroughputSettingsArgs> getReadProvisionedThroughputSettings() {
        return this.readProvisionedThroughputSettings == null ? Codegen.empty() : this.readProvisionedThroughputSettings;
    }

    public GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs(
        @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification,
        Output<String> indexName,
        @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings) {
        this.contributorInsightsSpecification = contributorInsightsSpecification;
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
    }

    private GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs() {
        this.contributorInsightsSpecification = Codegen.empty();
        this.indexName = Codegen.empty();
        this.readProvisionedThroughputSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification;
        private Output<String> indexName;
        private @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributorInsightsSpecification = defaults.contributorInsightsSpecification;
    	      this.indexName = defaults.indexName;
    	      this.readProvisionedThroughputSettings = defaults.readProvisionedThroughputSettings;
        }

        public Builder contributorInsightsSpecification(@Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification) {
            this.contributorInsightsSpecification = contributorInsightsSpecification;
            return this;
        }
        public Builder contributorInsightsSpecification(@Nullable GlobalTableContributorInsightsSpecificationArgs contributorInsightsSpecification) {
            this.contributorInsightsSpecification = Codegen.ofNullable(contributorInsightsSpecification);
            return this;
        }
        public Builder indexName(Output<String> indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        public Builder indexName(String indexName) {
            this.indexName = Output.of(Objects.requireNonNull(indexName));
            return this;
        }
        public Builder readProvisionedThroughputSettings(@Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
            return this;
        }
        public Builder readProvisionedThroughputSettings(@Nullable GlobalTableReadProvisionedThroughputSettingsArgs readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = Codegen.ofNullable(readProvisionedThroughputSettings);
            return this;
        }        public GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs build() {
            return new GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs(contributorInsightsSpecification, indexName, readProvisionedThroughputSettings);
        }
    }
}
