// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.run_v2.enums.GoogleCloudRunOpV2TrafficTargetType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Holds a single traffic routing entry for the Service. Allocations can be done to a specific Revision name, or pointing to the latest Ready Revision.
 * 
 */
public final class GoogleCloudRunOpV2TrafficTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2TrafficTargetArgs Empty = new GoogleCloudRunOpV2TrafficTargetArgs();

    /**
     * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    @Import(name="percent")
      private final @Nullable Output<Integer> percent;

    public Output<Integer> getPercent() {
        return this.percent == null ? Codegen.empty() : this.percent;
    }

    /**
     * Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<String> revision;

    public Output<String> getRevision() {
        return this.revision == null ? Codegen.empty() : this.revision;
    }

    /**
     * Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    /**
     * The allocation type for this traffic target.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<GoogleCloudRunOpV2TrafficTargetType> type;

    public Output<GoogleCloudRunOpV2TrafficTargetType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public GoogleCloudRunOpV2TrafficTargetArgs(
        @Nullable Output<Integer> percent,
        @Nullable Output<String> revision,
        @Nullable Output<String> tag,
        @Nullable Output<GoogleCloudRunOpV2TrafficTargetType> type) {
        this.percent = percent;
        this.revision = revision;
        this.tag = tag;
        this.type = type;
    }

    private GoogleCloudRunOpV2TrafficTargetArgs() {
        this.percent = Codegen.empty();
        this.revision = Codegen.empty();
        this.tag = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2TrafficTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> percent;
        private @Nullable Output<String> revision;
        private @Nullable Output<String> tag;
        private @Nullable Output<GoogleCloudRunOpV2TrafficTargetType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2TrafficTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
    	      this.revision = defaults.revision;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        public Builder percent(@Nullable Output<Integer> percent) {
            this.percent = percent;
            return this;
        }
        public Builder percent(@Nullable Integer percent) {
            this.percent = Codegen.ofNullable(percent);
            return this;
        }
        public Builder revision(@Nullable Output<String> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable String revision) {
            this.revision = Codegen.ofNullable(revision);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }
        public Builder type(@Nullable Output<GoogleCloudRunOpV2TrafficTargetType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable GoogleCloudRunOpV2TrafficTargetType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public GoogleCloudRunOpV2TrafficTargetArgs build() {
            return new GoogleCloudRunOpV2TrafficTargetArgs(percent, revision, tag, type);
        }
    }
}
