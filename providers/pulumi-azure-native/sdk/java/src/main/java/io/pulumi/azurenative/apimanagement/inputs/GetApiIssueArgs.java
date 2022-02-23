// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiIssueArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiIssueArgs Empty = new GetApiIssueArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final String apiId;

    public String getApiId() {
        return this.apiId;
    }

    /**
     * Expand the comment attachments.
     * 
     */
    @InputImport(name="expandCommentsAttachments")
      private final @Nullable Boolean expandCommentsAttachments;

    public Optional<Boolean> getExpandCommentsAttachments() {
        return this.expandCommentsAttachments == null ? Optional.empty() : Optional.ofNullable(this.expandCommentsAttachments);
    }

    /**
     * Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="issueId", required=true)
      private final String issueId;

    public String getIssueId() {
        return this.issueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetApiIssueArgs(
        String apiId,
        @Nullable Boolean expandCommentsAttachments,
        String issueId,
        String resourceGroupName,
        String serviceName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.expandCommentsAttachments = expandCommentsAttachments;
        this.issueId = Objects.requireNonNull(issueId, "expected parameter 'issueId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetApiIssueArgs() {
        this.apiId = null;
        this.expandCommentsAttachments = null;
        this.issueId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private @Nullable Boolean expandCommentsAttachments;
        private String issueId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiIssueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.expandCommentsAttachments = defaults.expandCommentsAttachments;
    	      this.issueId = defaults.issueId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setExpandCommentsAttachments(@Nullable Boolean expandCommentsAttachments) {
            this.expandCommentsAttachments = expandCommentsAttachments;
            return this;
        }

        public Builder setIssueId(String issueId) {
            this.issueId = Objects.requireNonNull(issueId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetApiIssueArgs build() {
            return new GetApiIssueArgs(apiId, expandCommentsAttachments, issueId, resourceGroupName, serviceName);
        }
    }
}
