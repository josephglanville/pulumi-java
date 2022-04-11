// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is used to represent the various nodes of the distributed container.
 * 
 */
public final class DistributedNodesInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributedNodesInfoArgs Empty = new DistributedNodesInfoArgs();

    /**
     * Name of the node under a distributed container.
     * 
     */
    @Import(name="nodeName")
      private final @Nullable Output<String> nodeName;

    public Output<String> getNodeName() {
        return this.nodeName == null ? Codegen.empty() : this.nodeName;
    }

    /**
     * Status of this Node.
     * Failed | Succeeded
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public DistributedNodesInfoArgs(
        @Nullable Output<String> nodeName,
        @Nullable Output<String> status) {
        this.nodeName = nodeName;
        this.status = status;
    }

    private DistributedNodesInfoArgs() {
        this.nodeName = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributedNodesInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nodeName;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributedNodesInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeName = defaults.nodeName;
    	      this.status = defaults.status;
        }

        public Builder nodeName(@Nullable Output<String> nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = Codegen.ofNullable(nodeName);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public DistributedNodesInfoArgs build() {
            return new DistributedNodesInfoArgs(nodeName, status);
        }
    }
}
