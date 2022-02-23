// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an input signal to be used on a pipeline node.
 * 
 */
public final class NodeInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeInputArgs Empty = new NodeInputArgs();

    /**
     * The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
     */
    @InputImport(name="nodeName", required=true)
      private final Input<String> nodeName;

    public Input<String> getNodeName() {
        return this.nodeName;
    }

    public NodeInputArgs(Input<String> nodeName) {
        this.nodeName = Objects.requireNonNull(nodeName, "expected parameter 'nodeName' to be non-null");
    }

    private NodeInputArgs() {
        this.nodeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> nodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeName = defaults.nodeName;
        }

        public Builder setNodeName(Input<String> nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = Input.of(Objects.requireNonNull(nodeName));
            return this;
        }
        public NodeInputArgs build() {
            return new NodeInputArgs(nodeName);
        }
    }
}
