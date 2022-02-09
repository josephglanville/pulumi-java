// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.DashboardPartsPositionArgs;
import io.pulumi.azurenative.portal.inputs.MarkdownPartMetadataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DashboardPartsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardPartsArgs Empty = new DashboardPartsArgs();

    @InputImport(name="metadata")
    private final @Nullable Input<MarkdownPartMetadataArgs> metadata;

    public Input<MarkdownPartMetadataArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="position", required=true)
    private final Input<DashboardPartsPositionArgs> position;

    public Input<DashboardPartsPositionArgs> getPosition() {
        return this.position;
    }

    public DashboardPartsArgs(
        @Nullable Input<MarkdownPartMetadataArgs> metadata,
        Input<DashboardPartsPositionArgs> position) {
        this.metadata = metadata;
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private DashboardPartsArgs() {
        this.metadata = Input.empty();
        this.position = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPartsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MarkdownPartMetadataArgs> metadata;
        private Input<DashboardPartsPositionArgs> position;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPartsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.position = defaults.position;
        }

        public Builder setMetadata(@Nullable Input<MarkdownPartMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable MarkdownPartMetadataArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setPosition(Input<DashboardPartsPositionArgs> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(DashboardPartsPositionArgs position) {
            this.position = Input.of(Objects.requireNonNull(position));
            return this;
        }

        public DashboardPartsArgs build() {
            return new DashboardPartsArgs(metadata, position);
        }
    }
}
