// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TarGZipReadSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TarGZipReadSettingsResponse Empty = new TarGZipReadSettingsResponse();

    @InputImport(name="preserveCompressionFileNameAsFolder")
    private final @Nullable Object preserveCompressionFileNameAsFolder;

    public Optional<Object> getPreserveCompressionFileNameAsFolder() {
        return this.preserveCompressionFileNameAsFolder == null ? Optional.empty() : Optional.ofNullable(this.preserveCompressionFileNameAsFolder);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public TarGZipReadSettingsResponse(
        @Nullable Object preserveCompressionFileNameAsFolder,
        String type) {
        this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TarGZipReadSettingsResponse() {
        this.preserveCompressionFileNameAsFolder = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TarGZipReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object preserveCompressionFileNameAsFolder;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TarGZipReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveCompressionFileNameAsFolder = defaults.preserveCompressionFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder setPreserveCompressionFileNameAsFolder(@Nullable Object preserveCompressionFileNameAsFolder) {
            this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TarGZipReadSettingsResponse build() {
            return new TarGZipReadSettingsResponse(preserveCompressionFileNameAsFolder, type);
        }
    }
}
