// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVideoArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVideoArgs Empty = new GetVideoArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the video to retrieve.
     * 
     */
    @InputImport(name="videoName", required=true)
      private final String videoName;

    public String getVideoName() {
        return this.videoName;
    }

    public GetVideoArgs(
        String accountName,
        String resourceGroupName,
        String videoName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.videoName = Objects.requireNonNull(videoName, "expected parameter 'videoName' to be non-null");
    }

    private GetVideoArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.videoName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String videoName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.videoName = defaults.videoName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVideoName(String videoName) {
            this.videoName = Objects.requireNonNull(videoName);
            return this;
        }
        public GetVideoArgs build() {
            return new GetVideoArgs(accountName, resourceGroupName, videoName);
        }
    }
}
