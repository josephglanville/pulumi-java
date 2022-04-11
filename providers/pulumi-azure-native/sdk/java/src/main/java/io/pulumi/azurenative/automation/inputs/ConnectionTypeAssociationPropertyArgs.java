// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The connection type property associated with the entity.
 * 
 */
public final class ConnectionTypeAssociationPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionTypeAssociationPropertyArgs Empty = new ConnectionTypeAssociationPropertyArgs();

    /**
     * Gets or sets the name of the connection type.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ConnectionTypeAssociationPropertyArgs(@Nullable Output<String> name) {
        this.name = name;
    }

    private ConnectionTypeAssociationPropertyArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionTypeAssociationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionTypeAssociationPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ConnectionTypeAssociationPropertyArgs build() {
            return new ConnectionTypeAssociationPropertyArgs(name);
        }
    }
}
