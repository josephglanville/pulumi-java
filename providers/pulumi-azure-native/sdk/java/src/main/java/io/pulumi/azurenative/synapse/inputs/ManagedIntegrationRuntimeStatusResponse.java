// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.ManagedIntegrationRuntimeErrorResponse;
import io.pulumi.azurenative.synapse.inputs.ManagedIntegrationRuntimeNodeResponse;
import io.pulumi.azurenative.synapse.inputs.ManagedIntegrationRuntimeOperationResultResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Managed integration runtime status.
 * 
 */
public final class ManagedIntegrationRuntimeStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeStatusResponse Empty = new ManagedIntegrationRuntimeStatusResponse();

    /**
     * The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    @InputImport(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The workspace name which the integration runtime belong to.
     * 
     */
    @InputImport(name="dataFactoryName", required=true)
      private final String dataFactoryName;

    public String getDataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * The last operation result that occurred on this integration runtime.
     * 
     */
    @InputImport(name="lastOperation", required=true)
      private final ManagedIntegrationRuntimeOperationResultResponse lastOperation;

    public ManagedIntegrationRuntimeOperationResultResponse getLastOperation() {
        return this.lastOperation;
    }

    /**
     * The list of nodes for managed integration runtime.
     * 
     */
    @InputImport(name="nodes", required=true)
      private final List<ManagedIntegrationRuntimeNodeResponse> nodes;

    public List<ManagedIntegrationRuntimeNodeResponse> getNodes() {
        return this.nodes;
    }

    /**
     * The errors that occurred on this integration runtime.
     * 
     */
    @InputImport(name="otherErrors", required=true)
      private final List<ManagedIntegrationRuntimeErrorResponse> otherErrors;

    public List<ManagedIntegrationRuntimeErrorResponse> getOtherErrors() {
        return this.otherErrors;
    }

    /**
     * The state of integration runtime.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ManagedIntegrationRuntimeStatusResponse(
        String createTime,
        String dataFactoryName,
        ManagedIntegrationRuntimeOperationResultResponse lastOperation,
        List<ManagedIntegrationRuntimeNodeResponse> nodes,
        List<ManagedIntegrationRuntimeErrorResponse> otherErrors,
        String state,
        String type) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.dataFactoryName = Objects.requireNonNull(dataFactoryName, "expected parameter 'dataFactoryName' to be non-null");
        this.lastOperation = Objects.requireNonNull(lastOperation, "expected parameter 'lastOperation' to be non-null");
        this.nodes = Objects.requireNonNull(nodes, "expected parameter 'nodes' to be non-null");
        this.otherErrors = Objects.requireNonNull(otherErrors, "expected parameter 'otherErrors' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedIntegrationRuntimeStatusResponse() {
        this.createTime = null;
        this.dataFactoryName = null;
        this.lastOperation = null;
        this.nodes = List.of();
        this.otherErrors = List.of();
        this.state = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String dataFactoryName;
        private ManagedIntegrationRuntimeOperationResultResponse lastOperation;
        private List<ManagedIntegrationRuntimeNodeResponse> nodes;
        private List<ManagedIntegrationRuntimeErrorResponse> otherErrors;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dataFactoryName = defaults.dataFactoryName;
    	      this.lastOperation = defaults.lastOperation;
    	      this.nodes = defaults.nodes;
    	      this.otherErrors = defaults.otherErrors;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDataFactoryName(String dataFactoryName) {
            this.dataFactoryName = Objects.requireNonNull(dataFactoryName);
            return this;
        }

        public Builder setLastOperation(ManagedIntegrationRuntimeOperationResultResponse lastOperation) {
            this.lastOperation = Objects.requireNonNull(lastOperation);
            return this;
        }

        public Builder setNodes(List<ManagedIntegrationRuntimeNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }

        public Builder setOtherErrors(List<ManagedIntegrationRuntimeErrorResponse> otherErrors) {
            this.otherErrors = Objects.requireNonNull(otherErrors);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedIntegrationRuntimeStatusResponse build() {
            return new ManagedIntegrationRuntimeStatusResponse(createTime, dataFactoryName, lastOperation, nodes, otherErrors, state, type);
        }
    }
}
