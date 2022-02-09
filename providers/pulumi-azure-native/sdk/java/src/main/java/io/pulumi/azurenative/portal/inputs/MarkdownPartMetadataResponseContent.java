// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.MarkdownPartMetadataResponseSettingsSettings;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MarkdownPartMetadataResponseContent extends io.pulumi.resources.InvokeArgs {

    public static final MarkdownPartMetadataResponseContent Empty = new MarkdownPartMetadataResponseContent();

    @InputImport(name="settings")
    private final @Nullable MarkdownPartMetadataResponseSettingsSettings settings;

    public Optional<MarkdownPartMetadataResponseSettingsSettings> getSettings() {
        return this.settings == null ? Optional.empty() : Optional.ofNullable(this.settings);
    }

    public MarkdownPartMetadataResponseContent(@Nullable MarkdownPartMetadataResponseSettingsSettings settings) {
        this.settings = settings;
    }

    private MarkdownPartMetadataResponseContent() {
        this.settings = null;
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
