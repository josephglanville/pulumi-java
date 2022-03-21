// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalDiskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalDiskArgs Empty = new GetLocalDiskArgs();

    /**
     * The device node of the local disk to retrieve. For example, `/dev/sdb`.
     * 
     */
    @Import(name="diskNode")
      private final @Nullable String diskNode;

    public Optional<String> getDiskNode() {
        return this.diskNode == null ? Optional.empty() : Optional.ofNullable(this.diskNode);
    }

    /**
     * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
     * 
     */
    @Import(name="diskPath")
      private final @Nullable String diskPath;

    public Optional<String> getDiskPath() {
        return this.diskPath == null ? Optional.empty() : Optional.ofNullable(this.diskPath);
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn", required=true)
      private final String gatewayArn;

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    public GetLocalDiskArgs(
        @Nullable String diskNode,
        @Nullable String diskPath,
        String gatewayArn) {
        this.diskNode = diskNode;
        this.diskPath = diskPath;
        this.gatewayArn = Objects.requireNonNull(gatewayArn, "expected parameter 'gatewayArn' to be non-null");
    }

    private GetLocalDiskArgs() {
        this.diskNode = null;
        this.diskPath = null;
        this.gatewayArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskNode;
        private @Nullable String diskPath;
        private String gatewayArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskNode = defaults.diskNode;
    	      this.diskPath = defaults.diskPath;
    	      this.gatewayArn = defaults.gatewayArn;
        }

        public Builder diskNode(@Nullable String diskNode) {
            this.diskNode = diskNode;
            return this;
        }
        public Builder diskPath(@Nullable String diskPath) {
            this.diskPath = diskPath;
            return this;
        }
        public Builder gatewayArn(String gatewayArn) {
            this.gatewayArn = Objects.requireNonNull(gatewayArn);
            return this;
        }        public GetLocalDiskArgs build() {
            return new GetLocalDiskArgs(diskNode, diskPath, gatewayArn);
        }
    }
}
