// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNodeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeSourceArgs Empty = new NodePoolNodeSourceArgs();

    /**
     * (Updatable) The OCID of the image used to boot the node.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return (Updatable) The OCID of the image used to boot the node.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * The user-friendly name of the entity corresponding to the OCID.
     * 
     */
    @Import(name="sourceName")
    private @Nullable Output<String> sourceName;

    /**
     * @return The user-friendly name of the entity corresponding to the OCID.
     * 
     */
    public Optional<Output<String>> sourceName() {
        return Optional.ofNullable(this.sourceName);
    }

    /**
     * (Updatable) The source type for the node. Use `IMAGE` when specifying an OCID of an image.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return (Updatable) The source type for the node. Use `IMAGE` when specifying an OCID of an image.
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    private NodePoolNodeSourceArgs() {}

    private NodePoolNodeSourceArgs(NodePoolNodeSourceArgs $) {
        this.imageId = $.imageId;
        this.sourceName = $.sourceName;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeSourceArgs $;

        public Builder() {
            $ = new NodePoolNodeSourceArgs();
        }

        public Builder(NodePoolNodeSourceArgs defaults) {
            $ = new NodePoolNodeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId (Updatable) The OCID of the image used to boot the node.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId (Updatable) The OCID of the image used to boot the node.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param sourceName The user-friendly name of the entity corresponding to the OCID.
         * 
         * @return builder
         * 
         */
        public Builder sourceName(@Nullable Output<String> sourceName) {
            $.sourceName = sourceName;
            return this;
        }

        /**
         * @param sourceName The user-friendly name of the entity corresponding to the OCID.
         * 
         * @return builder
         * 
         */
        public Builder sourceName(String sourceName) {
            return sourceName(Output.of(sourceName));
        }

        /**
         * @param sourceType (Updatable) The source type for the node. Use `IMAGE` when specifying an OCID of an image.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType (Updatable) The source type for the node. Use `IMAGE` when specifying an OCID of an image.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public NodePoolNodeSourceArgs build() {
            return $;
        }
    }

}
