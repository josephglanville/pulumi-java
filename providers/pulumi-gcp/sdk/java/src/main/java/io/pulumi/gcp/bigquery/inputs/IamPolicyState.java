// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final IamPolicyState Empty = new IamPolicyState();

    @InputImport(name="datasetId")
      private final @Nullable Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId == null ? Output.empty() : this.datasetId;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Output.empty() : this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @InputImport(name="tableId")
      private final @Nullable Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId == null ? Output.empty() : this.tableId;
    }

    public IamPolicyState(
        @Nullable Output<String> datasetId,
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> tableId) {
        this.datasetId = datasetId;
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.tableId = tableId;
    }

    private IamPolicyState() {
        this.datasetId = Output.empty();
        this.etag = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
        this.tableId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datasetId;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(IamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(@Nullable Output<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Output.ofNullable(datasetId);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder policyData(@Nullable String policyData) {
            this.policyData = Output.ofNullable(policyData);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder tableId(@Nullable Output<String> tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder tableId(@Nullable String tableId) {
            this.tableId = Output.ofNullable(tableId);
            return this;
        }
        public IamPolicyState build() {
            return new IamPolicyState(datasetId, etag, policyData, project, tableId);
        }
    }
}
