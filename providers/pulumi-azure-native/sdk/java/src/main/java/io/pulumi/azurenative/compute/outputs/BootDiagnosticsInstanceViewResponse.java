// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BootDiagnosticsInstanceViewResponse {
    private final String consoleScreenshotBlobUri;
    private final String serialConsoleLogBlobUri;
    private final InstanceViewStatusResponse status;

    @OutputCustomType.Constructor({"consoleScreenshotBlobUri","serialConsoleLogBlobUri","status"})
    private BootDiagnosticsInstanceViewResponse(
        String consoleScreenshotBlobUri,
        String serialConsoleLogBlobUri,
        InstanceViewStatusResponse status) {
        this.consoleScreenshotBlobUri = Objects.requireNonNull(consoleScreenshotBlobUri);
        this.serialConsoleLogBlobUri = Objects.requireNonNull(serialConsoleLogBlobUri);
        this.status = Objects.requireNonNull(status);
    }

    public String getConsoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }
    public String getSerialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }
    public InstanceViewStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consoleScreenshotBlobUri;
        private String serialConsoleLogBlobUri;
        private InstanceViewStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleScreenshotBlobUri = defaults.consoleScreenshotBlobUri;
    	      this.serialConsoleLogBlobUri = defaults.serialConsoleLogBlobUri;
    	      this.status = defaults.status;
        }

        public Builder setConsoleScreenshotBlobUri(String consoleScreenshotBlobUri) {
            this.consoleScreenshotBlobUri = Objects.requireNonNull(consoleScreenshotBlobUri);
            return this;
        }

        public Builder setSerialConsoleLogBlobUri(String serialConsoleLogBlobUri) {
            this.serialConsoleLogBlobUri = Objects.requireNonNull(serialConsoleLogBlobUri);
            return this;
        }

        public Builder setStatus(InstanceViewStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public BootDiagnosticsInstanceViewResponse build() {
            return new BootDiagnosticsInstanceViewResponse(consoleScreenshotBlobUri, serialConsoleLogBlobUri, status);
        }
    }
}
