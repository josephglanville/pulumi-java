// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Table card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs();

    /**
     * Optional. List of buttons for the card.
     * 
     */
    @Import(name="buttons")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> getButtons() {
        return this.buttons == null ? Output.empty() : this.buttons;
    }

    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    @Import(name="columnProperties")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> getColumnProperties() {
        return this.columnProperties == null ? Output.empty() : this.columnProperties;
    }

    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    public Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Optional. Rows in this table of data.
     * 
     */
    @Import(name="rows")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> getRows() {
        return this.rows == null ? Output.empty() : this.rows;
    }

    /**
     * Optional. Subtitle to the title.
     * 
     */
    @Import(name="subtitle")
      private final @Nullable Output<String> subtitle;

    public Output<String> getSubtitle() {
        return this.subtitle == null ? Output.empty() : this.subtitle;
    }

    /**
     * Title of the card.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs(
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties,
        @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows,
        @Nullable Output<String> subtitle,
        Output<String> title) {
        this.buttons = buttons;
        this.columnProperties = columnProperties;
        this.image = image;
        this.rows = rows;
        this.subtitle = subtitle;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs() {
        this.buttons = Output.empty();
        this.columnProperties = Output.empty();
        this.image = Output.empty();
        this.rows = Output.empty();
        this.subtitle = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties;
        private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows;
        private @Nullable Output<String> subtitle;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons) {
            this.buttons = buttons;
            return this;
        }
        public Builder buttons(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs> buttons) {
            this.buttons = Output.ofNullable(buttons);
            return this;
        }
        public Builder buttons(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs... buttons) {
            return buttons(List.of(buttons));
        }
        public Builder columnProperties(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties) {
            this.columnProperties = columnProperties;
            return this;
        }
        public Builder columnProperties(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs> columnProperties) {
            this.columnProperties = Output.ofNullable(columnProperties);
            return this;
        }
        public Builder columnProperties(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs... columnProperties) {
            return columnProperties(List.of(columnProperties));
        }
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable GoogleCloudDialogflowV2beta1IntentMessageImageArgs image) {
            this.image = Output.ofNullable(image);
            return this;
        }
        public Builder rows(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows) {
            this.rows = rows;
            return this;
        }
        public Builder rows(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs> rows) {
            this.rows = Output.ofNullable(rows);
            return this;
        }
        public Builder rows(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs... rows) {
            return rows(List.of(rows));
        }
        public Builder subtitle(@Nullable Output<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public Builder subtitle(@Nullable String subtitle) {
            this.subtitle = Output.ofNullable(subtitle);
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
