// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VideoArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoArgs Empty = new VideoArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    /**
     * The name of the video to create or update.
     * 
     */
    @InputImport(name="videoName")
      private final @Nullable Output<String> videoName;

    public Output<String> getVideoName() {
        return this.videoName == null ? Output.empty() : this.videoName;
    }

    public VideoArgs(
        Output<String> accountName,
        @Nullable Output<String> description,
        Output<String> resourceGroupName,
        @Nullable Output<String> title,
        @Nullable Output<String> videoName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.title = title;
        this.videoName = videoName;
    }

    private VideoArgs() {
        this.accountName = Output.empty();
        this.description = Output.empty();
        this.resourceGroupName = Output.empty();
        this.title = Output.empty();
        this.videoName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> description;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> title;
        private @Nullable Output<String> videoName;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.title = defaults.title;
    	      this.videoName = defaults.videoName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }

        public Builder videoName(@Nullable Output<String> videoName) {
            this.videoName = videoName;
            return this;
        }

        public Builder videoName(@Nullable String videoName) {
            this.videoName = Output.ofNullable(videoName);
            return this;
        }
        public VideoArgs build() {
            return new VideoArgs(accountName, description, resourceGroupName, title, videoName);
        }
    }
}
