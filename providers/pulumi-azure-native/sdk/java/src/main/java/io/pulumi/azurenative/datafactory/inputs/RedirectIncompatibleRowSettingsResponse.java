// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Redirect incompatible row settings
 * 
 */
public final class RedirectIncompatibleRowSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RedirectIncompatibleRowSettingsResponse Empty = new RedirectIncompatibleRowSettingsResponse();

    /**
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Object linkedServiceName;

    public Object getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="path")
      private final @Nullable Object path;

    public Optional<Object> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    public RedirectIncompatibleRowSettingsResponse(
        Object linkedServiceName,
        @Nullable Object path) {
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private RedirectIncompatibleRowSettingsResponse() {
        this.linkedServiceName = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectIncompatibleRowSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object linkedServiceName;
        private @Nullable Object path;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectIncompatibleRowSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder linkedServiceName(Object linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder path(@Nullable Object path) {
            this.path = path;
            return this;
        }        public RedirectIncompatibleRowSettingsResponse build() {
            return new RedirectIncompatibleRowSettingsResponse(linkedServiceName, path);
        }
    }
}
