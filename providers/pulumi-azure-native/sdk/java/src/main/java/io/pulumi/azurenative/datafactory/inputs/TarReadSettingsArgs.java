// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TarReadSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TarReadSettingsArgs Empty = new TarReadSettingsArgs();

    @InputImport(name="preserveCompressionFileNameAsFolder")
    private final @Nullable Input<Object> preserveCompressionFileNameAsFolder;

    public Input<Object> getPreserveCompressionFileNameAsFolder() {
        return this.preserveCompressionFileNameAsFolder == null ? Input.empty() : this.preserveCompressionFileNameAsFolder;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TarReadSettingsArgs(
        @Nullable Input<Object> preserveCompressionFileNameAsFolder,
        Input<String> type) {
        this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TarReadSettingsArgs() {
        this.preserveCompressionFileNameAsFolder = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TarReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> preserveCompressionFileNameAsFolder;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TarReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveCompressionFileNameAsFolder = defaults.preserveCompressionFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder setPreserveCompressionFileNameAsFolder(@Nullable Input<Object> preserveCompressionFileNameAsFolder) {
            this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
            return this;
        }

        public Builder setPreserveCompressionFileNameAsFolder(@Nullable Object preserveCompressionFileNameAsFolder) {
            this.preserveCompressionFileNameAsFolder = Input.ofNullable(preserveCompressionFileNameAsFolder);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public TarReadSettingsArgs build() {
            return new TarReadSettingsArgs(preserveCompressionFileNameAsFolder, type);
        }
    }
}
