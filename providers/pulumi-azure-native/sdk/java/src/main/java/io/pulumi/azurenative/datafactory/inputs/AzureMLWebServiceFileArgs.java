// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;


/**
 * Azure ML WebService Input/Output file
 * 
 */
public final class AzureMLWebServiceFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLWebServiceFileArgs Empty = new AzureMLWebServiceFileArgs();

    /**
     * The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="filePath", required=true)
      private final Input<Object> filePath;

    public Input<Object> getFilePath() {
        return this.filePath;
    }

    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
      private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    public AzureMLWebServiceFileArgs(
        Input<Object> filePath,
        Input<LinkedServiceReferenceArgs> linkedServiceName) {
        this.filePath = Objects.requireNonNull(filePath, "expected parameter 'filePath' to be non-null");
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
    }

    private AzureMLWebServiceFileArgs() {
        this.filePath = Input.empty();
        this.linkedServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLWebServiceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> filePath;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLWebServiceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.linkedServiceName = defaults.linkedServiceName;
        }

        public Builder setFilePath(Input<Object> filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder setFilePath(Object filePath) {
            this.filePath = Input.of(Objects.requireNonNull(filePath));
            return this;
        }

        public Builder setLinkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }
        public AzureMLWebServiceFileArgs build() {
            return new AzureMLWebServiceFileArgs(filePath, linkedServiceName);
        }
    }
}
