// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The managed identity for the Video Analyzer resource.
 * 
 */
public final class VideoAnalyzerIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoAnalyzerIdentityArgs Empty = new VideoAnalyzerIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The User Assigned Managed Identities.
     * 
     */
    @InputImport(name="userAssignedIdentities")
      private final @Nullable Input<Map<String,Object>> userAssignedIdentities;

    public Input<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public VideoAnalyzerIdentityArgs(
        Input<String> type,
        @Nullable Input<Map<String,Object>> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private VideoAnalyzerIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;
        private @Nullable Input<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }
        public VideoAnalyzerIdentityArgs build() {
            return new VideoAnalyzerIdentityArgs(type, userAssignedIdentities);
        }
    }
}
