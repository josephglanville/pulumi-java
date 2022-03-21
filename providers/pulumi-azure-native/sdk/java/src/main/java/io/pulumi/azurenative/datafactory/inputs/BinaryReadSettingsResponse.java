// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TarGZipReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.TarReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.ZipDeflateReadSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Binary read settings.
 * 
 */
public final class BinaryReadSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BinaryReadSettingsResponse Empty = new BinaryReadSettingsResponse();

    /**
     * Compression settings.
     * 
     */
    @Import(name="compressionProperties")
      private final @Nullable Object compressionProperties;

    public Object getCompressionProperties() {
        return this.compressionProperties == null ? null : this.compressionProperties;
    }

    /**
     * The read setting type.
     * Expected value is 'BinaryReadSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public BinaryReadSettingsResponse(
        @Nullable Object compressionProperties,
        String type) {
        this.compressionProperties = compressionProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BinaryReadSettingsResponse() {
        this.compressionProperties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinaryReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object compressionProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BinaryReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionProperties = defaults.compressionProperties;
    	      this.type = defaults.type;
        }

        public Builder compressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public BinaryReadSettingsResponse build() {
            return new BinaryReadSettingsResponse(compressionProperties, type);
        }
    }
}
