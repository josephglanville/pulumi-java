// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyIamPolicyArgs Empty = new TaxonomyIamPolicyArgs();

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="taxonomy", required=true)
      private final Output<String> taxonomy;

    public Output<String> getTaxonomy() {
        return this.taxonomy;
    }

    public TaxonomyIamPolicyArgs(
        Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> taxonomy) {
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
        this.taxonomy = Objects.requireNonNull(taxonomy, "expected parameter 'taxonomy' to be non-null");
    }

    private TaxonomyIamPolicyArgs() {
        this.policyData = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.taxonomy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.taxonomy = defaults.taxonomy;
        }

        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder taxonomy(Output<String> taxonomy) {
            this.taxonomy = Objects.requireNonNull(taxonomy);
            return this;
        }
        public Builder taxonomy(String taxonomy) {
            this.taxonomy = Output.of(Objects.requireNonNull(taxonomy));
            return this;
        }        public TaxonomyIamPolicyArgs build() {
            return new TaxonomyIamPolicyArgs(policyData, project, region, taxonomy);
        }
    }
}
