'use strict';
{
  $(function () {
    // 社員一覧：削除ボタン
    $('.employee-list__del-btn').on('click', function () {
      const result = confirm('削除します。よろしいですか？');
      if (!result) {
        return false;
      }
    });
  });
}
