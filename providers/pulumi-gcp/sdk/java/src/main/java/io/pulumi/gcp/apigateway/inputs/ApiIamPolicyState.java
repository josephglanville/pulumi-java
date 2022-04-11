// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ApiIamPolicyState Empty = new ApiIamPolicyState();

    @Import(name="api")
      private final @Nullable Output<String> api;

    public Output<String> getApi() {
        return this.api == null ? Codegen.empty() : this.api;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Codegen.empty() : this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public ApiIamPolicyState(
        @Nullable Output<String> api,
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project) {
        this.api = api;
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
    }

    private ApiIamPolicyState() {
        this.api = Codegen.empty();
        this.etag = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> api;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder api(@Nullable Output<String> api) {
            this.api = api;
            return this;
        }
        public Builder api(@Nullable String api) {
            this.api = Codegen.ofNullable(api);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }
        public Builder policyData(@Nullable String policyData) {
            this.policyData = Codegen.ofNullable(policyData);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public ApiIamPolicyState build() {
            return new ApiIamPolicyState(api, etag, policyData, project);
        }
    }
}
