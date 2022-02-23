// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorJsonFormatDescriptorFileCompression;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorJsonFormatDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorJsonFormatDescriptorArgs Empty = new AnomalyDetectorJsonFormatDescriptorArgs();

    @InputImport(name="charset")
      private final @Nullable Input<String> charset;

    public Input<String> getCharset() {
        return this.charset == null ? Input.empty() : this.charset;
    }

    @InputImport(name="fileCompression")
      private final @Nullable Input<AnomalyDetectorJsonFormatDescriptorFileCompression> fileCompression;

    public Input<AnomalyDetectorJsonFormatDescriptorFileCompression> getFileCompression() {
        return this.fileCompression == null ? Input.empty() : this.fileCompression;
    }

    public AnomalyDetectorJsonFormatDescriptorArgs(
        @Nullable Input<String> charset,
        @Nullable Input<AnomalyDetectorJsonFormatDescriptorFileCompression> fileCompression) {
        this.charset = charset;
        this.fileCompression = fileCompression;
    }

    private AnomalyDetectorJsonFormatDescriptorArgs() {
        this.charset = Input.empty();
        this.fileCompression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorJsonFormatDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> charset;
        private @Nullable Input<AnomalyDetectorJsonFormatDescriptorFileCompression> fileCompression;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorJsonFormatDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.fileCompression = defaults.fileCompression;
        }

        public Builder setCharset(@Nullable Input<String> charset) {
            this.charset = charset;
            return this;
        }

        public Builder setCharset(@Nullable String charset) {
            this.charset = Input.ofNullable(charset);
            return this;
        }

        public Builder setFileCompression(@Nullable Input<AnomalyDetectorJsonFormatDescriptorFileCompression> fileCompression) {
            this.fileCompression = fileCompression;
            return this;
        }

        public Builder setFileCompression(@Nullable AnomalyDetectorJsonFormatDescriptorFileCompression fileCompression) {
            this.fileCompression = Input.ofNullable(fileCompression);
            return this;
        }
        public AnomalyDetectorJsonFormatDescriptorArgs build() {
            return new AnomalyDetectorJsonFormatDescriptorArgs(charset, fileCompression);
        }
    }
}
