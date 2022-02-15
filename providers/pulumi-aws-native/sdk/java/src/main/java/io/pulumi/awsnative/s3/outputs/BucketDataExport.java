// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketDestination;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketDataExport {
    private final BucketDestination destination;
    private final String outputSchemaVersion;

    @OutputCustomType.Constructor({"destination","outputSchemaVersion"})
    private BucketDataExport(
        BucketDestination destination,
        String outputSchemaVersion) {
        this.destination = Objects.requireNonNull(destination);
        this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion);
    }

    public BucketDestination getDestination() {
        return this.destination;
    }
    public String getOutputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDataExport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketDestination destination;
        private String outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDataExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder setDestination(BucketDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setOutputSchemaVersion(String outputSchemaVersion) {
            this.outputSchemaVersion = Objects.requireNonNull(outputSchemaVersion);
            return this;
        }

        public BucketDataExport build() {
            return new BucketDataExport(destination, outputSchemaVersion);
        }
    }
}