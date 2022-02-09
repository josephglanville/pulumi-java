// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponseSettingsSettings;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MarkdownPartMetadataResponseContent {
    private final @Nullable MarkdownPartMetadataResponseSettingsSettings settings;

    @OutputCustomType.Constructor({"settings"})
    private MarkdownPartMetadataResponseContent(@Nullable MarkdownPartMetadataResponseSettingsSettings settings) {
        this.settings = settings;
    }

    public Optional<MarkdownPartMetadataResponseSettingsSettings> getSettings() {
        return Optional.ofNullable(this.settings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponseContent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponseSettingsSettings settings;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponseContent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settings = defaults.settings;
        }

        public Builder setSettings(@Nullable MarkdownPartMetadataResponseSettingsSettings settings) {
            this.settings = settings;
            return this;
        }

        public MarkdownPartMetadataResponseContent build() {
            return new MarkdownPartMetadataResponseContent(settings);
        }
    }
}
