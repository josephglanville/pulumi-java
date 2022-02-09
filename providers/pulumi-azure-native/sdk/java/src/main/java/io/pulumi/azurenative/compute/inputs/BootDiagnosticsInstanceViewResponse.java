// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BootDiagnosticsInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final BootDiagnosticsInstanceViewResponse Empty = new BootDiagnosticsInstanceViewResponse();

    @InputImport(name="consoleScreenshotBlobUri", required=true)
    private final String consoleScreenshotBlobUri;

    public String getConsoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    @InputImport(name="serialConsoleLogBlobUri", required=true)
    private final String serialConsoleLogBlobUri;

    public String getSerialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    @InputImport(name="status", required=true)
    private final InstanceViewStatusResponse status;

    public InstanceViewStatusResponse getStatus() {
        return this.status;
    }

    public BootDiagnosticsInstanceViewResponse(
        String consoleScreenshotBlobUri,
        String serialConsoleLogBlobUri,
        InstanceViewStatusResponse status) {
        this.consoleScreenshotBlobUri = Objects.requireNonNull(consoleScreenshotBlobUri, "expected parameter 'consoleScreenshotBlobUri' to be non-null");
        this.serialConsoleLogBlobUri = Objects.requireNonNull(serialConsoleLogBlobUri, "expected parameter 'serialConsoleLogBlobUri' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BootDiagnosticsInstanceViewResponse() {
        this.consoleScreenshotBlobUri = null;
        this.serialConsoleLogBlobUri = null;
        this.status = null;
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
