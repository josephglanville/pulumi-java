// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebBackendServiceIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebBackendServiceIamPolicyArgs Empty = new WebBackendServiceIamPolicyArgs();

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

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="webBackendService", required=true)
      private final Output<String> webBackendService;

    public Output<String> getWebBackendService() {
        return this.webBackendService;
    }

    public WebBackendServiceIamPolicyArgs(
        Output<String> policyData,
        @Nullable Output<String> project,
        Output<String> webBackendService) {
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.webBackendService = Objects.requireNonNull(webBackendService, "expected parameter 'webBackendService' to be non-null");
    }

    private WebBackendServiceIamPolicyArgs() {
        this.policyData = Output.empty();
        this.project = Output.empty();
        this.webBackendService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebBackendServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private Output<String> webBackendService;

        public Builder() {
    	      // Empty
        }

        public Builder(WebBackendServiceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.webBackendService = defaults.webBackendService;
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
        public Builder webBackendService(Output<String> webBackendService) {
            this.webBackendService = Objects.requireNonNull(webBackendService);
            return this;
        }
        public Builder webBackendService(String webBackendService) {
            this.webBackendService = Output.of(Objects.requireNonNull(webBackendService));
            return this;
        }        public WebBackendServiceIamPolicyArgs build() {
            return new WebBackendServiceIamPolicyArgs(policyData, project, webBackendService);
        }
    }
}
