// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoFlagsResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoMediaInfoResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoStreamingResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVideoResult {
    /**
     * Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    private final @Nullable String description;
    /**
     * Video flags contain information about the available video actions and its dynamic properties based on the current video state.
     * 
     */
    private final VideoFlagsResponse flags;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Contains information about the video and audio content.
     * 
     */
    private final VideoMediaInfoResponse mediaInfo;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Video streaming holds information about video streaming URLs.
     * 
     */
    private final VideoStreamingResponse streaming;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    private final @Nullable String title;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetVideoResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("flags") VideoFlagsResponse flags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mediaInfo") VideoMediaInfoResponse mediaInfo,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("streaming") VideoStreamingResponse streaming,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.flags = flags;
        this.id = id;
        this.mediaInfo = mediaInfo;
        this.name = name;
        this.streaming = streaming;
        this.systemData = systemData;
        this.title = title;
        this.type = type;
    }

    /**
     * Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Video flags contain information about the available video actions and its dynamic properties based on the current video state.
     * 
    */
    public VideoFlagsResponse getFlags() {
        return this.flags;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Contains information about the video and audio content.
     * 
    */
    public VideoMediaInfoResponse getMediaInfo() {
        return this.mediaInfo;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Video streaming holds information about video streaming URLs.
     * 
    */
    public VideoStreamingResponse getStreaming() {
        return this.streaming;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Optional video title provided by the user. Value can be up to 256 characters long.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVideoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private VideoFlagsResponse flags;
        private String id;
        private VideoMediaInfoResponse mediaInfo;
        private String name;
        private VideoStreamingResponse streaming;
        private SystemDataResponse systemData;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVideoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.flags = defaults.flags;
    	      this.id = defaults.id;
    	      this.mediaInfo = defaults.mediaInfo;
    	      this.name = defaults.name;
    	      this.streaming = defaults.streaming;
    	      this.systemData = defaults.systemData;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder flags(VideoFlagsResponse flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mediaInfo(VideoMediaInfoResponse mediaInfo) {
            this.mediaInfo = Objects.requireNonNull(mediaInfo);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder streaming(VideoStreamingResponse streaming) {
            this.streaming = Objects.requireNonNull(streaming);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetVideoResult build() {
            return new GetVideoResult(description, flags, id, mediaInfo, name, streaming, systemData, title, type);
        }
    }
}
