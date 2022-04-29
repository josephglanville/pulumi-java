// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomTableSavedCustomTableGroupByTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomTableSavedCustomTableGroupByTagArgs Empty = new CustomTableSavedCustomTableGroupByTagArgs();

    /**
     * (Updatable) The tag key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (Updatable) The tag key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Updatable) The tag namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return (Updatable) The tag namespace.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * (Updatable) The tag value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return (Updatable) The tag value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CustomTableSavedCustomTableGroupByTagArgs() {}

    private CustomTableSavedCustomTableGroupByTagArgs(CustomTableSavedCustomTableGroupByTagArgs $) {
        this.key = $.key;
        this.namespace = $.namespace;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomTableSavedCustomTableGroupByTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomTableSavedCustomTableGroupByTagArgs $;

        public Builder() {
            $ = new CustomTableSavedCustomTableGroupByTagArgs();
        }

        public Builder(CustomTableSavedCustomTableGroupByTagArgs defaults) {
            $ = new CustomTableSavedCustomTableGroupByTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key (Updatable) The tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Updatable) The tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param namespace (Updatable) The tag namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace (Updatable) The tag namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param value (Updatable) The tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value (Updatable) The tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CustomTableSavedCustomTableGroupByTagArgs build() {
            return $;
        }
    }

}
