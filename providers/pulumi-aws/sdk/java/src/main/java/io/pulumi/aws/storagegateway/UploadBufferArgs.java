// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UploadBufferArgs extends io.pulumi.resources.ResourceArgs {

    public static final UploadBufferArgs Empty = new UploadBufferArgs();

    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    @Import(name="diskId")
      private final @Nullable Output<String> diskId;

    public Output<String> getDiskId() {
        return this.diskId == null ? Output.empty() : this.diskId;
    }

    /**
     * Local disk path. For example, `/dev/nvme1n1`.
     * 
     */
    @Import(name="diskPath")
      private final @Nullable Output<String> diskPath;

    public Output<String> getDiskPath() {
        return this.diskPath == null ? Output.empty() : this.diskPath;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn", required=true)
      private final Output<String> gatewayArn;

    public Output<String> getGatewayArn() {
        return this.gatewayArn;
    }

    public UploadBufferArgs(
        @Nullable Output<String> diskId,
        @Nullable Output<String> diskPath,
        Output<String> gatewayArn) {
        this.diskId = diskId;
        this.diskPath = diskPath;
        this.gatewayArn = Objects.requireNonNull(gatewayArn, "expected parameter 'gatewayArn' to be non-null");
    }

    private UploadBufferArgs() {
        this.diskId = Output.empty();
        this.diskPath = Output.empty();
        this.gatewayArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadBufferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskId;
        private @Nullable Output<String> diskPath;
        private Output<String> gatewayArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadBufferArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.diskPath = defaults.diskPath;
    	      this.gatewayArn = defaults.gatewayArn;
        }

        public Builder diskId(@Nullable Output<String> diskId) {
            this.diskId = diskId;
            return this;
        }
        public Builder diskId(@Nullable String diskId) {
            this.diskId = Output.ofNullable(diskId);
            return this;
        }
        public Builder diskPath(@Nullable Output<String> diskPath) {
            this.diskPath = diskPath;
            return this;
        }
        public Builder diskPath(@Nullable String diskPath) {
            this.diskPath = Output.ofNullable(diskPath);
            return this;
        }
        public Builder gatewayArn(Output<String> gatewayArn) {
            this.gatewayArn = Objects.requireNonNull(gatewayArn);
            return this;
        }
        public Builder gatewayArn(String gatewayArn) {
            this.gatewayArn = Output.of(Objects.requireNonNull(gatewayArn));
            return this;
        }        public UploadBufferArgs build() {
            return new UploadBufferArgs(diskId, diskPath, gatewayArn);
        }
    }
}
